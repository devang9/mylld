package designpatterns.adapter;

public class HpPrinterAdapter implements Printer{


    HpPrinter hpPrinter;

    public HpPrinterAdapter(HpPrinter hpPrinter) {
        this.hpPrinter = hpPrinter;
    }

    @Override
    public void print(String content) {
        hpPrinter.printInHp();
    }
}
