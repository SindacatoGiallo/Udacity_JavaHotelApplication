import java.sql.Date;
import java.util.Scanner;
//package application.menu;

public class MainMenu {
    private static HotelResource hotelResource = new HotelResource();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                
                case 1:
                //  add the variables to store user inputs and pass them to the bookARoom method
                    System.out.println("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter the room number: ");
                    //<Integer> roomNumber = Integer.parseInt(scanner.nextLine());
                    String roomNumberStr = scanner.nextLine();
                    IRoom room = HotelResource.getRoom(roomNumberStr);
                    System.out.println("Enter the check in date (mm/dd/yyyy): ");
                    String checkInDateStr = scanner.nextLine();
                    Date checkInDate = Date.valueOf(checkInDateStr);                    
                    System.out.println("Enter the check out date (mm/dd/yyyy): ");
                    String checkOutDateStr = scanner.nextLine();
                    Date checkOutDate = Date.valueOf(checkOutDateStr);
                    HotelResource.bookARoom(email, room, checkInDate, checkOutDate);
                    break;
                case 2:
                // see all reservations
                    //HotelResource.displayAllRooms();
                    //empy commit
                    break;
                case 3:
                    // here you need to create a customer by calling the mothod createACustomer in the HotelResource class
                    System.out.println("Enter your email: ");
                    String customerEmail = scanner.nextLine();
                    System.out.println("Enter your first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter your last name: ");
                    String lastName = scanner.nextLine();
                    HotelResource.createACustomer(customerEmail, firstName, lastName);
                    break;
                case 4:
                    // call the Admin Menu
                    AdminMenu.main(null);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Hotel Management System");
        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an Account");
        System.out.println("4. Admin Menu");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}
