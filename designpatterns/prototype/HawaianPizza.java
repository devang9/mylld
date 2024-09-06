package designpatterns.prototype;

public class HawaianPizza extends CloneablePizza{

    public int numberOfPineapplePieces;

    public HawaianPizza(){

    }

    public HawaianPizza(HawaianPizza pizzaToClone) {
        super(pizzaToClone);
        if(pizzaToClone!=null){
            this.numberOfPineapplePieces = pizzaToClone.numberOfPineapplePieces;
        }
    }

    @Override
    public CloneablePizza clone() {
        return new HawaianPizza(this);
    }
}
