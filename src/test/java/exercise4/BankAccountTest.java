package exercise4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {


  private BankAccount account;

  @BeforeEach
  public void setUp() {
    account = new BankAccount("Max", "Mustermann", 11223, 1000.25, 500);
  }

  @Test
  public void testDeposit() {
    account.deposit(100);
    assertEquals(1100.25, account.balance);
  }

  @Test
  public void testWithdraw() {
    account.withdraw(30);
    assertEquals(970.25, account.balance);
  }

  @Test
  public void testWithdrawOverLimit() {
    account.withdraw(600);
    assertEquals(1000.25, account.balance);
  }

  @Test
  public void testWithdrawToNegative() {
    account.withdraw(500);
    account.withdraw(500);
    account.withdraw(10);
    assertEquals(0.25, account.balance);
  }


}