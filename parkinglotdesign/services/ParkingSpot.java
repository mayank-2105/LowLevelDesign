package services;

public class ParkingSpot {
    int id;
    vehicleType psType;
    boolean isFree;
    Vehicle vehicle;
    ParkingSpot(int spotNum,vehicleType psType) {
        id=spotNum;
        this.psType = psType;
        isFree=true;
        vehicle=null;
    }
}
