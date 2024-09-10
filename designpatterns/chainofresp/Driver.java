package designpatterns.chainofresp;

public class Driver {
    public static void main(String[] args) {

        TenDispenser tenDispenser = new TenDispenser();
        tenDispenser.setNextHandler(null);

        HundredDispenser hundredDispenser = new HundredDispenser();
        hundredDispenser.setNextHandler(tenDispenser);

        FiveHundredDispenser fiveHundredDispenser = new FiveHundredDispenser();
        fiveHundredDispenser.setNextHandler(hundredDispenser);

        fiveHundredDispenser.handle(665);
    }


}
