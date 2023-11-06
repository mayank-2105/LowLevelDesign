package decoratordesignpattern.pizza;

public class ExtraCheese extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
