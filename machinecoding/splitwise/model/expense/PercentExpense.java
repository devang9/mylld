package machinecoding.splitwise.model.expense;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.SplitType;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.model.Split;

import java.util.List;

public class PercentExpense extends Expense{
    public PercentExpense(String expenseName, double amount, User paidByUser, SplitType splitType, List<Split> splits, Group group) {
        super(expenseName, amount, paidByUser, splitType, splits,group);
    }

    @Override
    public boolean validateExpense() {
        return true;
    }
}
