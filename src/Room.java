public class Room {
    private int roomNum;
    private boolean bookedStatus;

    public Room(int roomNum) {
        this.roomNum = roomNum;
        this.bookedStatus = false;
    }

    public void updateBookedStatus(){
        bookedStatus = true;
    }

    public int getRoomNum() {
        return roomNum;
    }
}
