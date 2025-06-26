public class User {
    private static int userCount;
    private int userId;
    private String userName;
    private Room bookedRoom;

    public User(String userName) {
        this.userId = ++userCount;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void updateBookedRoom(Room room){
        this.bookedRoom = room;
    }

}
