package Passenger;

import java.time.LocalDate;

public abstract class PassengerTransport {
    private String NameofPT;
    private int capability;
    private LocalDate LastCheckDate;

    public PassengerTransport(String NameofPT,int capability,LocalDate LastChcekDate){
        this.NameofPT = NameofPT;
        this.capability = capability;
        this.LastCheckDate = LastChcekDate;
    }

    public int getCapability(){
     return  this.capability;
    }

    public String toString(){
        return NameofPT + "\n Max Passengers: " + capability + "\nLast Check Date: " + LastCheckDate;
    }
}
