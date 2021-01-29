/**
 * SportsCar, a type of Vehicle
 * @author Brooks Robinson
 */
public class SportsCar extends Vehicle {

    /**
     * Constructor for the SportsCar object
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    /**
     * Gives the cost of the sports car when called
     * @return price of a sports car
     */
    public double getCost() {
        return 30000.00;
    }
}
