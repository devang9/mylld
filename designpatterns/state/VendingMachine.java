package designpatterns.state;

public class VendingMachine {
    private State state;
    private int kurkurePacketsCount;

    private NoCoinState noCoinState;
    private CoinInsertedState coinInsertedState;

    public NoCoinState getNoCoinState() {
        return noCoinState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public OutOfKurkureState getOutOfKurkureState() {
        return outOfKurkureState;
    }

    private OutOfKurkureState outOfKurkureState;

    public int getKurkurePacketsCount() {
        return kurkurePacketsCount;
    }

    public void setKurkurePacketsCount(int kurkurePacketsCount) {
        this.kurkurePacketsCount = kurkurePacketsCount;
    }

    public VendingMachine(int kurkurePacketsCount) {
        this.kurkurePacketsCount = kurkurePacketsCount;

        noCoinState = new NoCoinState();
        coinInsertedState = new CoinInsertedState();
        outOfKurkureState = new OutOfKurkureState();

        this.state = kurkurePacketsCount>0 ? noCoinState:outOfKurkureState;

    }

    public void setState(State state) {
        this.state = state;
    }

    void insertCoin(){
        state.insertCoin(this);
    }
    void removeCoin(){
        state.removeCoin(this);
    }
    void dispenseKurkure(){
        state.dispenseKurkure(this);
    }
}
