package decoratordesignpattern;

import decoratordesignpattern.Toppings.Mushroom;
import decoratordesignpattern.pizza.BasePizza;
import decoratordesignpattern.pizza.ExtraCheese;
import decoratordesignpattern.Toppings.Oregano;

public class Main {
    public static void main(String args[]) {
        BasePizza obj = new Oregano(new Mushroom(new ExtraCheese())); 
        System.out.println(obj.cost());
    }
}
