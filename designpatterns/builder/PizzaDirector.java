package designpatterns.builder;

public class PizzaDirector {

    public Pizza buildRomanianMargheritaPizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.basil(true).crustType(CrustType.CRUNCHY).build();
    }

    public Pizza buildNeapolitanChipotlePizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.mushroom(true).crustType(CrustType.FLUFFY).build();
    }
}
