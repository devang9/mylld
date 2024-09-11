package machinecoding.splitwise.model;

import machinecoding.splitwise.model.User;

public class Split {
    private User user;
    private double shareAmount;

    public Split(User user) {
        this.user = user;
    }

    public Split(User user, double shareAmount) {
        this.user = user;
        this.shareAmount = shareAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(double shareAmount) {
        this.shareAmount = shareAmount;
    }
}
