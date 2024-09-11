package machinecoding.splitwise.repository;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.expense.Expense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitwiseRepository {
    private static SplitwiseRepository obj;

    private List<Group> groups = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>();


    private Map<String,Map<String,Map<String,Double>>> groupwiseBalanceSheet = new HashMap<>();

    private SplitwiseRepository() {
    }

    public static SplitwiseRepository getInstance() {
        if(obj==null){
            obj=new SplitwiseRepository();
        }
        return obj;
    }

    public Map<String, Map<String, Map<String, Double>>> getGroupwiseBalanceSheet() {
        return groupwiseBalanceSheet;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void saveExpense(Expense expense){
        expenses.add(expense);
    }
}
