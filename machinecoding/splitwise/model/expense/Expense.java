package machinecoding.splitwise.model.expense;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.Split;
import machinecoding.splitwise.model.SplitType;
import machinecoding.splitwise.model.User;

import java.util.List;

public abstract class Expense {
    private String expenseName;
    private double amount;
    private User paidByUser;
    private SplitType splitType;
    private List<Split> splits;

    private Group group;
    public Expense(String expenseName, double amount, User paidByUser, SplitType splitType, List<Split> splits,Group group) {
        this.expenseName = expenseName;
        this.amount = amount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splits = splits;
        this.group = group;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidByUser() {
        return paidByUser;
    }

    public void setPaidByUser(User paidByUser) {
        this.paidByUser = paidByUser;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    public abstract boolean validateExpense();
}
