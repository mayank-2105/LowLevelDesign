package src;
import src.Strategy.NormalDriveStrategy;

public class Honda extends Car {
    Honda() {
    super(new NormalDriveStrategy());
    }
}
