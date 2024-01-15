import java.util.Date;

public class Reservation {
    public Customer customer;
    public IRoom room;
    public Date checkInDate;
    public Date checkOutDate;

    @Override
    public String toString() {
        return "Customer: " + customer + " Room: " + room + " Check in date: " + checkInDate + " Check out date: "
                + checkOutDate;
    }   

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
}
