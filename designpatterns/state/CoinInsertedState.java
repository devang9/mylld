package designpatterns.state;

public class CoinInsertedState implements State{

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Invalid Operation");
    }

    @Override
    public void removeCoin(VendingMachine machine) {
        machine.setState(machine.getNoCoinState());
        System.out.println("Coin Removed. Insert New Coin");
    }

    @Override
    public void dispenseKurkure(VendingMachine machine) {
        machine.setKurkurePacketsCount(machine.getKurkurePacketsCount()-1);
        System.out.println("Here is your kurkure solid masti. Enjoy your junk food");
        if(machine.getKurkurePacketsCount()<=0){
            machine.setState(machine.getOutOfKurkureState());
            System.out.println("All kurkure finished. Fuck off now");
        }
        else{
            machine.setState(machine.getNoCoinState());
            System.out.println("Insert New Coin");
        }
    }
}
