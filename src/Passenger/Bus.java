package Passenger;

import Passenger.PassengerTransport;

import java.time.LocalDate;

public class Bus extends PassengerTransport {
    public Bus(String NameofPT, int capability, LocalDate LastChcekDate){
        super(NameofPT,capability,LastChcekDate);
        }

    @Override
    public String toString() {
        return "\nPassenger.Bus Name: " +  super.toString();
    }
}