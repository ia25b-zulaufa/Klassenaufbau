package finalExercise;

import java.io.Console;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company("ZKB", "Neue Hard", 200, 35);

        boolean programmIsRunning = true;
        char inputChar;
        int inputInt;
        String inputStr;

        while (programmIsRunning) {
            System.out.println("Unbook Room (u) | Book Room (b) | List Rooms (l) | Quit (q)");
            inputChar = sc.next().toLowerCase().charAt(0);

            if (inputChar == 'b') {
                System.out.println("Enter the Room Number:");
                inputStr = sc.next();

                company.bookRoom(inputStr);

            }else if (inputChar == 'l') {
                System.out.println("List Free Rooms (f) | List Based On Capacity (c)");
                inputChar = sc.next().toLowerCase().charAt(0);
                if  (inputChar == 'f') {
                    company.freeRooms();
                }else if (inputChar == 'c') {
                    System.out.println("Enter the Minimum Capacity:");
                    inputInt = sc.nextInt();
                    company.searchRoom(inputInt);
                }
            }else if (inputChar == 'q') {
                programmIsRunning = false;
            }else if (inputChar == 'u') {
                System.out.println("Enter the Room Number:");
                inputStr = sc.next();

                company.unbookRoom(inputStr);

            }
        }
    }
}
