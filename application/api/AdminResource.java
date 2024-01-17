import java.util.List;

public class AdminResource {

    public static Customer getCustomer(String email) {
        return CustomerService.getCustomer(email);
    }

    public static void addRoom(List<IRoom> rooms) {
        for (IRoom room : rooms) {
            
            ReservationService.addRoom(room);
        }
        
    }

    public static List<IRoom> getAllRooms() {
        return ReservationService.roomList;
    }

    public static List<Customer> getAllCustomers() {
        return CustomerService.allCustomers;
    }    

    public static void displayAllReservations() {
        ReservationService.printAllReservation();
    }   



}
