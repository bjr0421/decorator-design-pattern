/**
 * Compact, a type of Vehicle
 * @author Brooks Robinson
 */
public class Compact extends Vehicle {

    /**
     * Constructor for the Compact object
     */
    public Compact() {
        this.description = "Compact Car";
    }

    /**
     * Returns the cost of a Compact vehicle when called
     * @return price of a compact vehicle
     */
    public double getCost() {
        return 15000.00;
    }
}
