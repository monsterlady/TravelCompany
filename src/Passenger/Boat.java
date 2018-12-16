package Passenger;

import java.time.LocalDate;

public class Boat extends PassengerTransport {
    private String sequenceNum;

     public Boat(String NameofPT, int capability, LocalDate LastChcekDate,String sequenceNum){
         super(NameofPT,capability,LastChcekDate);
         this.sequenceNum = sequenceNum;
     }

    @Override
    public String toString() {
        return "\n Passenger.Boat Name: " + sequenceNum + " " + super.toString();
    }
}
