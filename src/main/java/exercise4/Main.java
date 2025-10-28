package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean programRunning = true;
        char input;
        double numberInput;

        String name;
        String surname;
        int limit;
        double balance;

        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("What is your surname?");
        surname = sc.nextLine();
        System.out.println("What is your balance?");
        balance = sc.nextDouble();
        System.out.println("What is your limit?");
        limit = sc.nextInt();
        BankAccount bankAccount = new BankAccount(name, surname, balance, limit);

        while (programRunning) {
            System.out.println("Deposit (d) | Withdraw (w) | Account Details (a) | Show Balance (b) | Quit (q)");
            input = sc.next().toLowerCase().charAt(0);

            if (input == 'd'){
                System.out.println("Hpw much do you want to deposit?");
                numberInput = sc.nextDouble();
                bankAccount.deposit(numberInput);
            }else if (input == 'w'){
                System.out.println("Hpw much do you want to withdraw?");
                numberInput = sc.nextDouble();
                bankAccount.withdraw(numberInput);
            }else  if (input == 'a'){
                System.out.println(bankAccount);
            }else  if (input == 'b'){
                bankAccount.printBalance();
            }else if (input == 'q'){
                programRunning = false;
            }else {
                System.out.println("Invalid input");
            }
        }

    }
}
