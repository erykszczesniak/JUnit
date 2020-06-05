import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {
    @org.junit.Test
    public void deposit() throws Exception {
     BankAccount account = new BankAccount("Eryk", "Szczesniak", 4000.00, BankAccount.CHECKING);
    assertEquals(4000.00, account.getBalance(), 0);
}

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Eryk", "Szczesniak", 4000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(4200.00, balance, 0);

    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Eryk", "Szczesniak", 4000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(3800.00,account.getBalance(),0);

    }
    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Eryk", "Szczesniak", 4000.00, BankAccount.CHECKING);
        assertEquals(true, account.isChecking());
    }

}