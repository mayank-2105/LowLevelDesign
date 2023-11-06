package driver;
import java.util.Scanner;
import services.ParkingLot;
import services.ParkingLotManager;
import services.NearestParkingStrategy;
import services.Vehicle;

public class Main {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t=100;
        ParkingLotManager pLotMgr;
        pLotMgr = new ParkingLotManager(new NearestParkingStrategy());
        while(t>0) {
        String userInput = scanner.nextLine();
        String []userInputList = userInput.split(" ");
        
        if (userInput.contains("create")) {
            int numFloors = Integer.parseInt(userInputList[2]);
            int numSlots = Integer.parseInt(userInputList[3]);
            ParkingLot pLot = new ParkingLot(userInputList[1], numFloors, numSlots);
            
            pLotMgr.parkingLots.add(pLot);
            System.out.println(pLotMgr.parkingLots.get(0).floors.get(0).id);
            System.out.println("Created parking lot with "+numFloors+" and "+numSlots+" slots per floor");
        } else if (userInput.contains("display")) {

        } else if (userInput.contains("unpark")) {
            String ticketID= userInputList[1];
            pLotMgr.unparkVehicle(ticketID);
        } else if (userInput.contains("park")) {
            Vehicle vhcl = new Vehicle(userInputList[2], userInputList[1], userInputList[3]);
            pLotMgr.parkVehicle(vhcl);
        } else {
            System.out.println("Not a valid command");
        }
        t--;
        }
        scanner.close();

        
    }
}
