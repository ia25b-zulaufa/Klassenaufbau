package finalExercise;

import java.util.ArrayList;

public class Company {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private String name;
    private String address;
    private int roomCount;
    private int maxRoomCapacity;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Company(String name, String address, int roomCount, int maxRoomCapacity) {
        this.name = name;
        this.address = address;
        this.roomCount = roomCount;
        this.maxRoomCapacity = maxRoomCapacity;

        for (int i = 1; i <= roomCount; i++) {
            addRoom((int)(Math.random() * maxRoomCapacity) + 1);
        }

        for (int i = 1; i <= roomCount / 2.5; i++) {
            bookRoom(String.valueOf((int)(Math.random() * roomCount)));
        }
    }
    public Company(String name, String address, int roomCount, int maxRoomCapacity, boolean createList ) {
        this.name = name;
        this.address = address;
        this.roomCount = roomCount;
        this.maxRoomCapacity = maxRoomCapacity;

        if (createList) {
            for (int i = 1; i <= roomCount; i++) {
                addRoom((int)(Math.random() * maxRoomCapacity) + 1);
            }

            for (int i = 1; i <= roomCount / 2.5; i++) {
                bookRoom(String.valueOf((int)(Math.random() * roomCount)));
            }
        }
    }

    public void addRoom(int capacity) {
        rooms.addLast(new Room(rooms.size(), capacity));
    }

    public void searchRoom(int minCapacity) {
        int counter = 0;
        int counter2 = 0;

        for (Room room : rooms) {
            if (!room.isBooked && room.capacity >= minCapacity) {
                System.out.println(ANSI_GREEN + room + ANSI_RESET);
                counter++;
            }else if (room.isBooked && room.capacity >= minCapacity){
                System.out.println(ANSI_RED + room + ANSI_RESET);
                counter2++;
            }
        }

        System.out.println(counter + " Free Rooms Found");
        System.out.println(counter2 + " Booked Rooms Found");
        System.out.println((counter2 + counter) + " Total Rooms Found");
    }

    public void freeRooms(){
        ArrayList<Room> freeRooms = new ArrayList<>();
        int counter = 0;

        for (Room room : rooms) {
            if (!room.isBooked){
                System.out.println(ANSI_GREEN + room + ANSI_RESET);
                counter++;
            }
        }
        System.out.println(counter + " Free Rooms Found");
    }

    public void bookRoom(String roomNumberToBook){
        for (Room room : rooms) {
            if (roomNumberToBook.equals(String.valueOf(room.roomNumber)) &&  !room.isBooked){
                room.isBooked = true;
                System.out.println("Room number " + room.roomNumber + " was booked");
            }else if (roomNumberToBook.equals(String.valueOf(room.roomNumber))) {
                System.out.println("Room number " + room.roomNumber + " is already booked");
            }
        }
    }

    public void unbookRoom(String roomNumberToUnbook){
        for (Room room : rooms) {
            if (roomNumberToUnbook.equals(String.valueOf(room.roomNumber)) &&  room.isBooked){
                room.isBooked = false;
                System.out.println("Room number " + room.roomNumber + " was unbooked");
            }else if (roomNumberToUnbook.equals(String.valueOf(room.roomNumber))) {
                System.out.println("Room number " + room.roomNumber + " isn't booked");
            }
        }
    }

    // GETTER AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getMaxRoomCapacity() {
        return maxRoomCapacity;
    }
    public void setMaxRoomCapacity(int maxRoomCapacity) {
        this.maxRoomCapacity = maxRoomCapacity;
    }

    public int getRoomCount() {
        return roomCount;
    }
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
