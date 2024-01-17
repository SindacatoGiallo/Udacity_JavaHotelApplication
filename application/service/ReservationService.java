import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ReservationService {

    public static List<Reservation> reservations = new ArrayList<>();
    public static Map<String, IRoom> rooms = new HashMap<>();
    public static List<IRoom> roomList = new ArrayList<>();
    public static Map<Customer, List<Reservation>> customerReservations;
    public static List<IRoom> availableRooms = roomList;

    


    public static void addRoom(IRoom room){
        roomList.add(room);
        rooms.put(room.getRoomNumber(), room);        
    }

    public static IRoom getARoom(String roomId){
        return rooms.get(roomId);
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        customerReservations.put(customer, reservations);
        return reservation;
    }

    public static List<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        // Find rooms that are not incuded in a reservation between the check in and check out date
        // Return a list of available rooms
        for (Reservation reservation : reservations) {
            if (!(checkOutDate.before(reservation.checkInDate) || checkInDate.after(reservation.checkOutDate))) {
                availableRooms.remove(reservation.room); // Remove the room if there's an overlap
            }
        }

        return availableRooms;
    }

    public static List<Reservation> getCustomersReservation(Customer customer){
        return customerReservations.get(customer);
    }
    
    public static void printAllReservation(){
        System.out.println(reservations);

    }

    


}
