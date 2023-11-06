package services;
import java.util.ArrayList;
import java.util.List;

public class Floor {
    public int id;
    List< ParkingSpot > psList = new ArrayList<>();
    Floor(int floorNum,int noSpots) {
        id=floorNum;
        for(int i=1;i<=noSpots;i++) {
            if(i==1)
            psList.add(new ParkingSpot(i, vehicleType.truck));
            else if (i<=3) {
                psList.add(new ParkingSpot(i, vehicleType.bike));
            }
            else {
                psList.add(new ParkingSpot(i, vehicleType.car));
            }

        }
    }
}
