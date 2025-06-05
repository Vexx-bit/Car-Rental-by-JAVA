/**
 * Represents a car in the rental system
 */
public class Car {
    // Car attributes
    private String plateNumber;  // Unique identifier for the car
    private String model;        // Car model name
    private boolean isAvailable;  // Availability status

    /**
     * Creates a new car with the given plate number and model
     * @param plateNumber The car's license plate number
     * @param model The car's model name
     */
    public Car(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.isAvailable = true;  // New cars are available by default
    }

    // Getters
    public String getPlateNumber() { 
        return plateNumber; 
    }
    
    public String getModel() { 
        return model; 
    }
    
    public boolean isAvailable() { 
        return isAvailable; 
    }

    // Methods to change car status
    public void rentCar() { 
        this.isAvailable = false; 
        System.out.println("Car " + plateNumber + " has been rented.");
    }
    
    public void returnCar() { 
        this.isAvailable = true; 
        System.out.println("Car " + plateNumber + " has been returned.");
    }
}
