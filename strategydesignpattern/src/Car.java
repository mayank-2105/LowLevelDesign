package src;
import src.Strategy.DriveStrategy;

public abstract class Car {
    DriveStrategy obj;
    Car(DriveStrategy consobj) {
        this.obj=consobj;
    }
    public void drive() {
        this.obj.drive();
    }
}

// public class Honda extends Car {
//     super(new NormalDriveStrategy());
// }

// public class Ciaz extends Car {
//     super(new SpecialDriveStrategy());
// }