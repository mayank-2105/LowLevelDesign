package services;



public class Vehicle {
    String regNo;
    vehicleType vhclType;
    String color;
    Ticket ticket;
    public Vehicle(String regNo, String vhclType, String color) {
        this.regNo=regNo;
        if(vhclType.equalsIgnoreCase("car"))
        this.vhclType=vehicleType.car;
        if(vhclType.equalsIgnoreCase("bike"))
        this.vhclType=vehicleType.bike;
        if(vhclType.equalsIgnoreCase("truck"))
        this.vhclType=vehicleType.truck;
        this.color=color;
        this.ticket=null;
    }
}
