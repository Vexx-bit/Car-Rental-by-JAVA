/**
 * Represents a customer in the car rental system
 */
public class Customer {
    // Customer attributes
    private String name;  // Customer's full name
    private String id;    // Customer's unique ID (could be national ID, etc.)
    private String rentedCarPlate;  // Plate number of the car currently rented by this customer

    /**
     * Creates a new customer with the given name and ID
     * @param name The customer's full name
     * @param id The customer's unique identifier
     */
    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.rentedCarPlate = null;  // Initially, customer hasn't rented any car
    }

    // Getters
    public String getName() { 
        return name; 
    }
    
    public String getId() { 
        return id; 
    }
    
    public String getRentedCarPlate() {
        return rentedCarPlate;
    }
    
    // Set rented car
    public void rentCar(String plateNumber) {
        this.rentedCarPlate = plateNumber;
    }
    
    // Return rented car
    public void returnCar() {
        this.rentedCarPlate = null;
    }
    
    // Check if customer has a rented car
    public boolean hasRentedCar() {
        return rentedCarPlate != null;
    }
    
    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + id + ")" + 
               (hasRentedCar() ? " - Rented Car: " + rentedCarPlate : " - No car rented");
    }
}
