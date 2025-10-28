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

    public BankAccount(String name, String surname, int accountNumber, double balance) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String name, String surname, int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }

  public void withdraw(int amount) {
      if (limit >= amount) {
          balance -= amount;
          if (balance < 0) {
              balance += amount;
          }
      }
  }

  public void deposit(double amount) {
      balance += amount;
  }

  public String toString() {
      return "Name: " + name + " Surname: " + surname + " AccountNumber: " + accountNumber + " Balance: " + balance + " Limit: " + limit;
  }
}
