package decoratordesignpattern.Toppings;

import decoratordesignpattern.pizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    @Override
    public int cost() {
        return this.bpObj.cost() + 20;
    }

    public Mushroom(BasePizza obj) {
        this.bpObj=obj;
    }
}
