package services;
import java.util.List;


public class NearestParkingStrategy implements ParkingStrategy {
    public void parkVehicle(Vehicle vhcl, List< ParkingLot >parkingLots) {
        ParkingLot pLot = parkingLots.get(0);
        boolean flag=false;
        for(int i=0;i<pLot.floors.size();i++) {
            Floor curFloor = pLot.floors.get(i);
            for(int j=0;j<curFloor.psList.size();j++) {
                ParkingSpot pSpot = curFloor.psList.get(j);
                if(pSpot.psType == vhcl.vhclType && pSpot.isFree == true) {
                    pSpot.isFree = false;
                    pSpot.vehicle = vhcl;

                    String ticketID = "";
                    ticketID += pLot.id+"_"+curFloor.id+"_"+pSpot.id;

                    Ticket ticketObj = new Ticket(ticketID, "1100");

                    vhcl.ticket=ticketObj;
                    flag=true;

                    System.out.println("Parked Vehicle. Ticket ID: "+ticketID);
                    break;
                }
            }
            if(flag)
            break;
        }
        if(!flag) {
            System.out.println("No available parking spot with given conditions");
        }
    }
}
