package designpatterns.prototype;

public class MargheritaPizza extends CloneablePizza{

    public String cheeseType;

    public MargheritaPizza(){

    }

    public MargheritaPizza(MargheritaPizza pizzaToClone) {
        super(pizzaToClone);
        if(pizzaToClone!=null){
            this.cheeseType = pizzaToClone.cheeseType;
        }
    }

    @Override
    public CloneablePizza clone() {
        return new MargheritaPizza(this);
    }
}
