package finalExercise;

public class Room {
    int roomNumber;
    int capacity;
    boolean isBooked = false;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String toString(){
        return "Room Number: " + roomNumber + ", Capacity: " + capacity;
    }
}
