import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    // List to store all cars in the agency
    private List<Car> cars;
    
    // Constructor
    public RentalAgency() {
        this.cars = new ArrayList<>();
    }
    
    // Add a new car to the agency
    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Added car: " + car.getModel() + " (" + car.getPlateNumber() + ")");
    }
    
    // Rent a car by plate number
    public boolean rentCar(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber) && car.isAvailable()) {
                car.rentCar();
                System.out.println("Successfully rented: " + car.getModel());
                return true;
            }
        }
        System.out.println("Car not available or not found!");
        return false;
    }
    
    // Return a rented car
    public void returnCar(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber) && !car.isAvailable()) {
                car.returnCar();
                System.out.println("Successfully returned: " + car.getModel());
                return;
            }
        }
        System.out.println("Car not found or already returned!");
    }
    
    // Show all available cars
    public void showAvailableCars() {
        System.out.println("\n--- Available Cars ---");
        boolean found = false;
        
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println("- " + car.getModel() + " (" + car.getPlateNumber() + ")");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No cars available at the moment.");
        }
    }
}