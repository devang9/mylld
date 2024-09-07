package designpatterns.state;

public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(10);

        //happy path
        vendingMachine.insertCoin();
        vendingMachine.dispenseKurkure();
        //failure path
        vendingMachine.removeCoin();
    }
}
