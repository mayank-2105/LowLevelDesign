package services;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String id;
    public List<Floor> floors = new ArrayList<>();
    public ParkingLot(String plID,int noFloors,int noSpots) {
        id=plID;
        for(int i=1;i<=noFloors;i++) 
        {
        floors.add(new Floor(i,noSpots));
        }
    }  
}
