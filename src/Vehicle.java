/**
 * Program Name: Vehicle
 * Date: 2025-03-20
 * @author Spencer DaSilva
 * Program Description: Vehicle
 */

public class Vehicle {
    private int noOfWheels;
    private String name;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(int wheels) throws WheelException {
        try {
            if (wheels == 1) {
                name = "Unicycle";
            }
            if (wheels == 2) {
                name = "bicycle";
            }
            if (wheels == 3) {
                name = "tricycle";
            }
            if (wheels == 4) {
                name = "quadcycle";
            }
        } catch(WheelException e){
            throw new WheelException(wheels);
        }
        this.name = name;
    }

    public Vehicle(){
        setNoOfWheels(4);
        setName(getNoOfWheels());
    }
    public Vehicle(int numberOfWheels){
        setNoOfWheels(numberOfWheels);
        setName(getNoOfWheels());
    }

}
