import Cargo.CargoTransport;
import Cargo.Containship;
import Cargo.Truck;
import Passenger.Boat;
import Passenger.Bus;
import Passenger.PassengerTransport;
import Passenger.Train;

import java.time.LocalDate;
import java.util.ArrayList;

public class Administration {

    private ArrayList<PassengerTransport> passengerTransportsArraylist = new ArrayList<>();
    private ArrayList<CargoTransport> cargoTransportArrayList = new ArrayList<>();


    public void addTrain(String name,int capability, int wagons, int lengthofTrain, int year,int month,int days){
        LocalDate time = LocalDate.of(year,month,days);
        Train train = new Train(name,capability,wagons,lengthofTrain,time);
        passengerTransportsArraylist.add(train);
    }

    public void addBus(String NameofPT,int capability,int year,int month,int days){
        LocalDate time = LocalDate.of(year,month,days);
        Bus bus = new Bus(NameofPT,capability,time);
        passengerTransportsArraylist.add(bus);
    }

    public void addboat(String NameofPT,int capability,int year,int month,int days,String sequenceNum){
        LocalDate time = LocalDate.of(year,month,days);
        Boat boat = new Boat(NameofPT,capability,time,sequenceNum);
        passengerTransportsArraylist.add(boat);
    }

    public void addTruck(int cargo,int lengthofcargo,int widthofcargo,int depthofcargo){
        Truck truck = new Truck(cargo,lengthofcargo,widthofcargo,depthofcargo);
        cargoTransportArrayList.add(truck);
    }

    public void addContainship(int cargo,int Numofcontainers){
        Containship containship = new Containship(cargo,Numofcontainers);
        cargoTransportArrayList.add(containship);
    }

    public void printPassengerTransportforMin(int numofppl){
        for(PassengerTransport each : passengerTransportsArraylist){
            if(each.getCapability() >= numofppl){
                System.out.println(each + "\n");
            }
        }
    }

    public void printRidingVechiles(){
        for(PassengerTransport each : passengerTransportsArraylist){
            if(each instanceof Bus || each instanceof Train){
                System.out.println(each + "\n");
            }
        }

        for(CargoTransport each : cargoTransportArrayList){
            if(each instanceof Truck){
                System.out.println(each + "\n");
            }
        }

    }

    public void printAllvechle(){
        if(passengerTransportsArraylist.isEmpty()){
            System.out.println("These is no available Vehicles for passengers now");
        } else {
            for(PassengerTransport each : passengerTransportsArraylist){
                System.out.println(each + "\n");
            }
        }

        if(cargoTransportArrayList.isEmpty()){
            System.out.println("These is no available Vehicles for cargo now");
        } else {
            for(CargoTransport each : cargoTransportArrayList){
                System.out.println(each + "\n");
            }
        }
    }
}
