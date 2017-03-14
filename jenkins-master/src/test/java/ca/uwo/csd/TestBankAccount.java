package ca.uwo.csd;



public class TestBankAccount {

  @Test
  public void testDebitWithSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double amount = account.debit(5);
    Assert.assertEquals(5.0,amount);
  }
  
   @Test
  public void testDebitWithInSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double amount = account.debit(11);
    Assert.assertEquals(10.0,amount);
  }
}
