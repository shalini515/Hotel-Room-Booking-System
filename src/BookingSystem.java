public class BookingSystem {

    public synchronized void bookRoom(User user, Hotel hotel) {
        try {
            Thread.sleep(450);  // sleeps for 1000ms = 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(hotel.getRoomsAvailable() > 0) {
            Room room = hotel.getRoom();
            room.updateBookedStatus();
            hotel.markRoomAsBooked();
            user.updateBookedRoom(room);
            System.out.println("Room: " + room.getRoomNum() + " " + "User: " + user.getUserName());
        }
        else{
            System.out.println("No rooms available for " + user.getUserName());
        }
    }
}
