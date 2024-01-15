public class Room implements IRoom {
    
    public String roomNumber;
    public Double price;
    public RoomType enumeration;
    
    @Override
    public String toString(){
        return "Room number: " + roomNumber + " Price: " + price + " Room type: " + enumeration;
    }

    @Override
    public String getRoomNumber(){
        return roomNumber;
    }

    @Override
    public double getRoomPrice(){
        return price;
    }

    @Override
    public RoomType getRoomType(){
        return enumeration;
    }

    @Override
    public boolean isFree(){
        return false;
    }

    public Room(String roomNumber, Double price, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }


    
}
