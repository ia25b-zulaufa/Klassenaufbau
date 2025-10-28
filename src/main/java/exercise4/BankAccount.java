package exercise4;

public class BankAccount {
    public double balance;
    public String name;
    public String surname;
    int accountNumber;
    int limit;

    public BankAccount(String name, String surname, int accountNumber, double balance, int limit) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.limit = limit;
  }
    public BankAccount(String name, String surname, double balance, int limit) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = (int)(Math.random() * 1000000000);
      this.balance = balance;
      this.limit = limit;
  }
    public BankAccount(String name, String surname, int accountNumber, double balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = (int)(Math.random() * 1000000000);
        this.balance = balance;
    }
    public BankAccount(String name, String surname, int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = (int)(Math.random() * 1000000000);
    }

    public void withdraw(double amount) {
        if (limit >= amount) {
            balance -= amount;
            if (balance < 0) {
                balance += amount;
                System.out.println("ERROR: Your account can't go into the negative");
            }
        }else {
            System.out.println("ERROR: Your limit is " + limit);
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void printBalance(){
        System.out.println("Your balance is " + balance);
    }

    public String toString() {
        return "Name: " + name
                + "\nSurname: " + surname
                + "\nAccountNumber: " + accountNumber
                + "\nBalance: " + balance
                + "\nLimit: " + limit;
    }
}
