import java.util.Scanner;

public class AdminMenu {
    
//create a while loop that acts as a CLI menu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
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
                    System.out.println("Enter the price per night: ");
                    Double pricePerNight = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the room type (SINGLE or DOUBLE): ");
                    RoomType roomType = RoomType.valueOf(scanner.nextLine());
                    //i need to create a list of IRoom objects to pass to the addRoom method
                    
                    AdminResource.addRoom(roomNumber, pricePerNight, roomType);
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


}
