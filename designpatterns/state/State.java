package designpatterns.state;

public interface State {
    void insertCoin(VendingMachine machine);
    void removeCoin(VendingMachine machine);
    void dispenseKurkure(VendingMachine machine);
}
