package designpatterns.adapter;

public class SonyPrinter implements Printer{
    @Override
    public void print(String content) {
        System.out.println("This is how sony will print");
    }
}
