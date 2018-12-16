package Cargo;

import Cargo.CargoTransport;

public class Containship extends CargoTransport {
    private int Numofcontainers;

    public Containship(int cargo,int Numofcontainers){
        super(cargo);
        this.Numofcontainers =Numofcontainers;
    }

    public int getNumofcontainers() {
        return Numofcontainers;
    }

    @Override
    public String toString() {
        return "This Cargo.Containship could hold " + super.toString() + "\n Containers: " + this.Numofcontainers;
    }
}
