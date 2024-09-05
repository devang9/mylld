package designpatterns.builder;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza buildRomanianMargheritaPizza(){
        return pizzaBuilder.basil(true).crustType(CrustType.CRUNCHY).build();
    }

    public Pizza buildNeapolitanChipotlePizza(){
        return pizzaBuilder.mushroom(true).crustType(CrustType.FLUFFY).build();
    }
}
