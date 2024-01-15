public class FreeRoom extends Room{

    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price = 0.0, enumeration);
    }

    @Override
    public String toString(){
        return "Room number: " + roomNumber + " Price: " + price + " Room type: " + enumeration;
    }
    
}
