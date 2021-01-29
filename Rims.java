/**
 * Rims, a decoration for Vehicles
 * @author Brooks Robinson
 */
public class Rims extends VehicleDecorator {

    Vehicle vehicle;

    /**
     * Constructor for the Rims object
     * @param vehicle the vehicle that receives the rims
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Appends the "cool rims" to the vehicle name to indicate it has cool rims
     * @return message indicating the vehicle has cool rims
     */
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Adds the cost of the rims to the cost of the vehicle
     * @return the vehicle cost combined with the cost of the rims
     */
    public double getCost() {
        return vehicle.getCost() + 200.00;
    }
}
