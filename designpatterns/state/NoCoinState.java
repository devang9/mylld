package designpatterns.state;

public class NoCoinState implements State{
    @Override
    public void insertCoin(VendingMachine machine) {
        machine.setState(machine.getCoinInsertedState());
        System.out.println("Coin Inserted");
    }

    @Override
    public void removeCoin(VendingMachine machine){
        System.out.println("Invalid Operation");
    }

    @Override
    public void dispenseKurkure(VendingMachine machine) {
        System.out.println("Invalid Operation");
    }
}
