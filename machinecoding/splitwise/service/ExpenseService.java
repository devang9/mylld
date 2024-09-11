package machinecoding.splitwise.service;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.Split;
import machinecoding.splitwise.model.expense.Expense;
import machinecoding.splitwise.model.expense.ExpenseFactory;
import machinecoding.splitwise.repository.SplitwiseRepository;

import java.util.Map;

public class ExpenseService {
    public void addExpense(String expenseName, String userName, String splitType, double amount, String splits, String groupId){
        SplitwiseRepository splitwiseRepository = SplitwiseRepository.getInstance();
        Expense expense  = ExpenseFactory.getExpenseObject(expenseName,userName,splitType,amount,splits,new Group(groupId));
        if(expense.validateExpense()){
            splitwiseRepository.saveExpense(expense);
            updateBalanceSheet(splitwiseRepository,expense);
        }

    }

    private void updateBalanceSheet(SplitwiseRepository splitwiseRepository, Expense expense) {
        Map<String, Map<String, Map<String, Double>>> allGroupBalanceSheet = splitwiseRepository.getGroupwiseBalanceSheet();
        Map<String, Map<String, Double>> currentGroupBalanceSheet = allGroupBalanceSheet.get(expense.getGroup().getId());
        for(Split split:expense.getSplits()){
            String from = expense.getPaidByUser().getUsername();
            String to = split.getUser().getUsername();
            if(from.equals(to))continue;
            //payer side
            Map<String,Double> fromUserBalances = currentGroupBalanceSheet.get(from);
            fromUserBalances.put(to,fromUserBalances.getOrDefault(to,0.0)+split.getShareAmount());
            //ower side
            Map<String,Double> toUserBalances = currentGroupBalanceSheet.get(to);
            toUserBalances.put(from,toUserBalances.getOrDefault(from,0.0)-split.getShareAmount());
        }

    }

    public Map<String, Map<String, Double>> showBalances(String groupName) {
        return SplitwiseRepository.getInstance().getGroupwiseBalanceSheet().get(groupName);
    }
}
