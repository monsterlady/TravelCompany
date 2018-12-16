package Cargo;

public class Truck  extends CargoTransport {
    private int lengthofcargo,widthofcargo,depthofcargo;

    public Truck(int cargo,int lengthofcargo,int widthofcargo,int depthofcargo){
        super(cargo);
        this.depthofcargo = depthofcargo;
        this.widthofcargo = widthofcargo;
        this.lengthofcargo = lengthofcargo;
    }

    public int getLengthofcargo(){
        return lengthofcargo;
    }

    public int getWidthofcargo() {
        return widthofcargo;
    }

    public int getDepthofcargo() {
        return depthofcargo;
    }

    @Override
    public String toString() {
        return "This truck could hold " + super.toString() + "\n Cargo length: " + this.lengthofcargo + "\n Cargo width: " + this.widthofcargo + "\n Cargo Depth: " + this.depthofcargo + "\n";
    }
}
