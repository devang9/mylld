package designpatterns.adapter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Printer> availablePrinters = new ArrayList<>();

        availablePrinters.add(new SonyPrinter());
        availablePrinters.add(new HpPrinterAdapter(new HpPrinter()));

        printInAllPrinters(availablePrinters);
    }

    public static void printInAllPrinters(List<Printer> availablePrinters ){
        availablePrinters.stream().forEach( (p) -> p.print("random"));
    }


}
