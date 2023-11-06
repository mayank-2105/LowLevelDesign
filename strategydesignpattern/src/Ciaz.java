package src;
import src.Strategy.SpecialDriveStrategy;

public class Ciaz extends Car {
    Ciaz() {
    super(new SpecialDriveStrategy());
    }
}