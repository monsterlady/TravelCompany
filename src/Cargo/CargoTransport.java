package Cargo;

public abstract class CargoTransport  {
    private int cargo;

    public CargoTransport(int cargo){
        this.cargo = cargo  ;
    }

    public int getCargo(){
        return this.cargo;
    }

    public String toString() {
        return this.cargo + " Tons";
    }
}
