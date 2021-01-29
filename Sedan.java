/**
 * Sedan, a type of Vehicle
 * @author Brooks Robinson
 */
public class Sedan extends Vehicle {

    /**
     * Constructor for the Sedan object
     */
    public Sedan() {
        this.description = "Sedan";
    }

    /**
     * Gives the cost of a sedan when called
     * @return price of a sedan
     */
    public double getCost() {
        return 20000.00;
    }
}
