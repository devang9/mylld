package designpatterns.prototype;

public class Driver {
    public static void main(String[] args) {

        MargheritaPizza margheritaPizza = new MargheritaPizza();
        margheritaPizza.size = 6;
        margheritaPizza.cheeseType="cheddar";


        MargheritaPizza margheritaPizza2 = (MargheritaPizza) margheritaPizza.clone();
        System.out.println(margheritaPizza2.cheeseType);
    }
}
