package machinecoding.splitwise.model.expense;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.SplitType;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.model.Split;

import java.util.ArrayList;
import java.util.List;

public class ExpenseFactory {
    public static Expense getExpenseObject(String expenseName, String userName, String splitType, double amount, String splitString, Group group) {
        List<Split> splits = new ArrayList<>();
        String[] individualContributions = splitString.split(",");
        int contributors = individualContributions.length;
        switch (splitType) {
            case "EQUAL":
                for (int i = 0; i < contributors; i++) {
                    //dchheda
                    splits.add(new Split(new User(individualContributions[i]),amount/contributors));
                }
                return new EqualExpense(expenseName,amount,new User(userName),SplitType.EQUAL,splits,group);
            case "UNEQUAL":
                for (int i = 0; i < contributors; i++) {
                    //dchheda-5000
                    String[] usernameAndValue = individualContributions[i].split("-");
                    splits.add(new Split(new User(usernameAndValue[0]),Double.parseDouble(usernameAndValue[1])));
                }
                return new UnequalExpense(expenseName,amount,new User(userName),SplitType.UNEQUAL,splits,group);
            case "PERCENT":
                for (int i = 0; i < contributors; i++) {
                    //dchheda-20
                    String[] usernameAndValue = individualContributions[i].split("-");
                    Double derivedAmount  = Double.parseDouble(usernameAndValue[1]) * amount/100;
                    splits.add(new Split(new User(usernameAndValue[0]),derivedAmount));
                }
                return new PercentExpense(expenseName,amount,new User(userName),SplitType.PERCENT,splits,group);
            default:
                return null;
        }
    }
}
