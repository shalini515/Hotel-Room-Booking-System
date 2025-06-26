public class BookingTask implements Runnable {
    private User user;
    private BookingSystem system;
    private Hotel hotel;

    public BookingTask(User user, BookingSystem system, Hotel hotel) {
        this.system = system;
        this.user = user;
        this.hotel = hotel;
    }

    @Override
    public void run(){
        system.bookRoom(user, hotel);
    }
}
