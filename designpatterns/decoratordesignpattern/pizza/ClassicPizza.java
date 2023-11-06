package decoratordesignpattern.pizza;

public class ClassicPizza extends BasePizza {
    @Override
    public int cost() {
        return 110;
    }
}
