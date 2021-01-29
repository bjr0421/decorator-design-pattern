/**
 * Paint, a decoration for Vehicles
 * @author Brooks Robinson
 */
public class Paint extends VehicleDecorator {

    Vehicle vehicle;

    /**
     * Constructor for the Paint object
     * @param vehicle the vehicle that receives the paint job
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Appends "fancy paint" to the vehicle type to indicate the car has fancy paint
     * @return message indicating the Vehicle has fancy paint
     */
    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Adds the price of the fancy paint to the price of the vehicle
     * @return the combined price of the vehicle and paint
     */
    public double getCost() {
        return vehicle.getCost() + 150.00;
    }
}
