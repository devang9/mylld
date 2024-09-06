package designpatterns.prototype;

import java.util.concurrent.atomic.AtomicLongArray;

public abstract class CloneablePizza {

    public int size;

    public CloneablePizza(){

    }

    public CloneablePizza(CloneablePizza pizzaToClone) {
        if(pizzaToClone!=null){
            this.size = pizzaToClone.size;
        }
    }

    public abstract CloneablePizza clone();
}
