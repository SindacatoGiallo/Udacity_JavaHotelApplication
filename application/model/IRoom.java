public interface IRoom {
    // Declare methods for getting room number and room type
    public String getRoomNumber();
    public double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();
}
