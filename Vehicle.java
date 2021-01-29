/**
 * Vehicle, an abstract object
 * @author Brooks Robinson
 */
public abstract class Vehicle {

    protected String description;

    /**
     * Returns the description of the vehicle when called
     * @return description of the vehicle
     */
    public String toString() {
        return description;
    }

    /**
     * Forces vehicles to include getCost
     */
    public abstract double getCost();
}