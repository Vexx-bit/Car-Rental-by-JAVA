import java.util.Scanner;

public class TestRental {
    public static void main(String[] args) {
        // Create a new rental agency
        RentalAgency agency = new RentalAgency();
        Scanner scanner = new Scanner(System.in);
        
        // Add some sample cars
        agency.addCar(new Car("KDA123", "Toyota Corolla"));
        agency.addCar(new Car("KDB456", "Honda Fit"));
        agency.addCar(new Car("KDC789", "Mazda 3"));
        
        int choice;
        
        do {
            // Display menu
            System.out.println("\n=== Car Rental System ===");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // Get user input
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    // Show available cars
                    agency.showAvailableCars();
                    break;
                    
                case 2:
                    // Rent a car
                    System.out.print("Enter car plate number to rent: ");
                    String plateToRent = scanner.nextLine();
                    agency.rentCar(plateToRent);
                    break;
                    
                case 3:
                    // Return a car
                    System.out.print("Enter car plate number to return: ");
                    String plateToReturn = scanner.nextLine();
                    agency.returnCar(plateToReturn);
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our Car Rental System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 4);
        
        scanner.close();
    }
}
