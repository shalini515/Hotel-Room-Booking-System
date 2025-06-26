public class Hotel {
    private int totalRoomsAvailabe;
    private int roomsAvailable;
    private int roomsBooked;
    private Room[] rooms;

    public Hotel(int totalRoomsAvailabe) {
        this.totalRoomsAvailabe = totalRoomsAvailabe;
        this.roomsAvailable = totalRoomsAvailabe;
        rooms = new Room[totalRoomsAvailabe];
        for(int i=0; i<totalRoomsAvailabe; i++) {
            Room room = new Room(i+1);
            rooms[i] = room;
        }
    }

    public synchronized Room bookRoom(User user) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (roomsAvailable > 0) {
            Room room = rooms[roomsBooked];
            room.updateBookedStatus();
            roomsBooked++;
            roomsAvailable--;
            user.updateBookedRoom(room);
            return room;
        }
        return null;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public Room getRoom() {
        Room room = rooms[this.roomsBooked];
        return room;
    }
}
