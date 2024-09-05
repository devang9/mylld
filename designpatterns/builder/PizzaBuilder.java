package designpatterns.builder;

public class PizzaBuilder {
    private boolean hasBasil;
    private boolean hasMushroom;
    private int size;
    private CrustType crustType;

    public PizzaBuilder basil(boolean hasBasil){
        this.hasBasil = hasBasil;
        return this;
    }

    public PizzaBuilder mushroom(boolean hasMushroom){
        this.hasBasil = hasBasil;
        return this;
    }

    public PizzaBuilder size(int size){
        this.size = size;
        return this;
    }

    public PizzaBuilder crustType(CrustType crustType){
        this.crustType = crustType;
        return this;
    }

    public Pizza build(){
        return new Pizza(hasBasil,hasMushroom,size,crustType);
    }
}
