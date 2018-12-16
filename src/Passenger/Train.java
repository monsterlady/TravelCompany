package Passenger;

import Passenger.PassengerTransport;

import java.time.LocalDate;

public class Train extends PassengerTransport {
    private int wagons;
    private int lengthofTrain;


    public Train(String name,int capability, int wagons, int lengthofTrain, LocalDate lastcheckdate){
        super(name,capability,lastcheckdate);
        this.wagons = wagons;
        this.lengthofTrain = lengthofTrain;
    }

    @Override
    public String toString() {
        return "\n Passenger.Train Name: "+ super.toString() + "\nWagons " + wagons + "\n Length:" + lengthofTrain;
    }
}
