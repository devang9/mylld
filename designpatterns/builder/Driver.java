package designpatterns.builder;

public class Driver {
    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);

        Pizza margheritaNeapolitanPizza = pizzaDirector.buildNeapolitanChipotlePizza();

        Pizza chipotleRomanianPizza = pizzaDirector.buildRomanianMargheritaPizza();

    }
}
