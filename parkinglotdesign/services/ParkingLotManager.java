package services;
import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    
    ParkingStrategy parkingStrategy;
    public List< ParkingLot >parkingLots = new ArrayList<>();

    public ParkingLotManager(ParkingStrategy pStrategy) {
        this.parkingStrategy = pStrategy;
    }
    public void parkVehicle(Vehicle vhcl) {
        System.out.println(parkingLots.get(0).floors.get(0).id);
        parkingStrategy.parkVehicle(vhcl, parkingLots);
    }
    public void unparkVehicle(String ticketID) {
        int floorNum = Integer.parseInt(ticketID.split("_")[1]);
        int spotNum = Integer.parseInt(ticketID.split("_")[2]);
        ParkingSpot pSpot = parkingLots.get(0).floors.get(floorNum-1).psList.get(spotNum-1);
        pSpot.isFree=true;
        System.out.println("Unparked Vehicle with Reg. No: "+pSpot.vehicle.regNo+"and color: "+pSpot.vehicle.color);
    }
    // void display() {

    // }
    // void addParkingSpot(String parkingLotID,int floorNumber,vehicleType psType) {
        
    // }
    // void addFloors(String parkingLotID) {

    // }
    
}
