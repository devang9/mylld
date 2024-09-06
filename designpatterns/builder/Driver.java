package designpatterns.builder;

public class Driver {
    public static void main(String[] args) {


        PizzaDirector pizzaDirector = new PizzaDirector();

        PizzaBuilder pizzaBuilder1 = new PizzaBuilder();
        Pizza margheritaNeapolitanPizza = pizzaDirector.buildNeapolitanChipotlePizza(pizzaBuilder1);

        PizzaBuilder pizzaBuilder2 = new PizzaBuilder();
        Pizza chipotleRomanianPizza = pizzaDirector.buildRomanianMargheritaPizza(pizzaBuilder2);

    }
}
