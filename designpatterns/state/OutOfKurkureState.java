package designpatterns.state;

public class OutOfKurkureState implements State{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Invalid Operation");
    }

    @Override
    public void removeCoin(VendingMachine machine) {
        System.out.println("Invalid Operation");
    }

    @Override
    public void dispenseKurkure(VendingMachine machine) {
        System.out.println("Invalid Operation");
    }
}
