/**
 * Car vehicle
 * Date: 3/20/25
 * @author Kyle Vardy
 */
public class Car extends Vehicle {
    int wheels;

    /**
     * New car object
     * @param wheels the amount of wheels the car has (should always be 4)
     */
    public Car(int wheels) {
        super(wheels);
        if (wheels != 4) throw new WheelException(wheels);
        this.wheels = wheels;
    }

    @Override
    public void setName(int wheels) {
        if (wheels != 4) {
            throw new RuntimeException(new CannotChangeNameException());
        }
    }

    /**
     * sets the amount of wheels should always be 4
     * @param wheels the amount of wheels to set
     */
    @Override
    public void setNoOfWheels(int wheels) {
        if (wheels != 4) throw new WheelException(wheels);
        this.wheels = wheels;
    }
}
