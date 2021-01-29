/**
 * SoundSystem, a decoration for Vehicles
 * @author Brooks Robinson
 */
public class SoundSystem extends VehicleDecorator {

    Vehicle vehicle;

    /**
     * Constructor for the SoundSystem object
     * @param vehicle the vehicle receiving the sound system
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Appends "awesome sound" to the vehicle's name that is receiving it
     * @return message indicating the vehicle has a sound system
     */
    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * Combines the cost of the vehicle with the sound system price
     * @return cost of the vehicle combined with the sound system price
     */
    public double getCost() {
        return vehicle.getCost() + 350.00;
    }
}
