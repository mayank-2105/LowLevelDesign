package decoratordesignpattern.Toppings;

import decoratordesignpattern.pizza.BasePizza;

public class Oregano extends ToppingDecorator {
    @Override
    public int cost() {
        return this.bpObj.cost()+15;
    } 
    public Oregano(BasePizza obj) {
        this.bpObj=obj;
    }
}
