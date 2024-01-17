import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AdminMenu {
    
//create a while loop that acts as a CLI menu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayAdminMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    // see all customers
                    AdminResource.getAllCustomers();
                    break;
                case 2:
                    // see all rooms
                    AdminResource.getAllRooms();
                    break;
                case 3:
                    // see all reservations
                    AdminResource.displayAllReservations();
                    break;
                case 4:
                    // add a room
                    System.out.println("Enter the room number: ");  
                    String roomNumber = scanner.nextLine();
                    System.out.println("Enter the price: ");
                    Double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Enter the room type: ");
                    RoomType roomType = null;
                    String roomTypeStr = scanner.nextLine();
                    if (roomTypeStr.equalsIgnoreCase("single")) {
                        roomType = RoomType.SINGLE;
                    } else if (roomTypeStr.equalsIgnoreCase("double")) {
                        roomType = RoomType.DOUBLE;
                    }
                    IRoom room = new Room(roomNumber, price, roomType);
                    List<IRoom> rooms = new ArrayList<>();
                    rooms.add(room);
                    AdminResource.addRoom(rooms);
                                        
                    break;
                case 5:
                    // back to main menu
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public static void displayAdminMenu() {
        System.out.println("Welcome Admin! ");
        System.out.println("1. See all Customers");
        System.out.println("2. See all Rooms");
        System.out.println("3. See all Reservations");
        System.out.println("4. Add a Room");
        System.out.println("5. Back to Main Menu");
        System.out.println("Please select a number for the menu option");
    }


}
