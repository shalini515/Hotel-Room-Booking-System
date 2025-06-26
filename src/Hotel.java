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

    public int getTotalRoomsAvailabe() {
        return totalRoomsAvailabe;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public int getRoomsBooked() {
        return roomsBooked;
    }

    public void markRoomAsBooked() {
        this.roomsBooked++;
        this.roomsAvailable--;
    }

    public Room getRoom() {
        Room room = rooms[this.roomsBooked];
        return room;
    }
}
