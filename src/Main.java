//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookingSystem system  = new BookingSystem();
        Hotel hotel = new Hotel(3);

        User user1 = new User("shalini");
        User user2 = new User("harini");
        User user3 = new User("dhanya");
        User user4 = new User("deeksha");
        User user5 = new User("ashwitha");

        Thread t1 = new Thread(new BookingTask(user1, system, hotel));
        Thread t2 = new Thread(new BookingTask(user2, system, hotel));
        Thread t3 = new Thread(new BookingTask(user3, system, hotel));
        Thread t4 = new Thread(new BookingTask(user4, system, hotel));
        Thread t5 = new Thread(new BookingTask(user5, system, hotel));

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

    }
}