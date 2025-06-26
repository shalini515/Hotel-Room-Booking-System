public class BookingSystem {
    public void bookRoom(User user, Hotel hotel) {
        Room room = hotel.bookRoom(user);
        if (room != null) {
            System.out.println("Room: " + room.getRoomNum() + " User: " + user.getUserName());
        } else {
            System.out.println("No rooms available for " + user.getUserName());
        }
    }
}
