package services;
import java.util.List;


public interface ParkingStrategy {
        void parkVehicle(Vehicle vhcl, List< ParkingLot >parkingLots);
    
} 

