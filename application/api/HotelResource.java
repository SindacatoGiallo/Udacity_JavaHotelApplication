import java.util.Date;
import java.util.List;

public class HotelResource {


    public Customer getCustomer(String email) {
        return CustomerService.getCustomer(email);
    }

    public static void createACustomer(String email, String firstName, String lastName) {
        CustomerService.addCustomer(email, firstName, lastName);
    }

    public static IRoom getRoom(String roomNumber) {
        return ReservationService.getARoom(roomNumber);
    }

    public static Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        Customer customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.reserveARoom(customer, room, checkInDate, checkOutDate);
    }

    public static List<Reservation> getCustomersReservations(String customerEmail) {
        Customer customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.getCustomersReservation(customer);
    }

    public static List<IRoom> findARoom(Date checkIn, Date checkOut) {
        return ReservationService.findRooms(checkIn, checkOut);
    }
}
