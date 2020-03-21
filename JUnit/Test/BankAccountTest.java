import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private BankAccount account2;
    private BankAccount account3;
    private BankAccount nullAccount;
    BankAccount[] accountArray = {account, account2, account3, nullAccount};
    BankAccount[] accountArray2 = {account, account2, account3, nullAccount};

    // how to set up for tests.
    @org.junit.jupiter.api.BeforeAll
    public static void beforeClass() {
        System.out.println("This executes before all test cases only once.");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup() {
        account = new BankAccount("Aaron", "Wright", 1000.00, BankAccount.SAVINGS);
        System.out.println("Aaron's account is set up.\n\n");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup2() {
        account2 = new BankAccount("Jeff", "Johnson", 3000.00, BankAccount.CHECKING);
        System.out.println("Jeff's account is set up.");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup3() {
        account3 = new BankAccount("Jeff", "Johnson", 3000.00, BankAccount.CHECKING);
        System.out.println("Jeff's account is set up.");
    }

    //Here are some ways to use the assertEquals method.
    @org.junit.jupiter.api.Test
    public void deposite() {
        double balance = account.deposite(201.00, false);
        assertEquals(1200.00, balance, 2);
    }

    @org.junit.jupiter.api.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    // This is an example of fail method. It allows you to automatically fail a test and send a message to the console based on conditions you set.
    @org.junit.jupiter.api.Test
    public void withdraw_notBranch() {
        try {
            account.withdraw(200.00, true);
            fail("Should have thrown exception.");
        } catch(IllegalArgumentException e) {}

    }

    @org.junit.jupiter.api.Test
    public void getBalance_deposit() {
        account.deposite(200.00, true);
        assertEquals(1201.00, account.getBalance(), 1);
    }

    @org.junit.jupiter.api.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    // You can also test for boolean values.
    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        assertTrue(account.isChecking());
    }

    @org.junit.jupiter.api.Test
    public void isChecking_false() {
        assertFalse(account.isChecking());
    }

    //You can also do your assertions based on whether an object is NULL
    @org.junit.jupiter.api.Test
    public void isNull() {
        assertNull(nullAccount);
    }

    @org.junit.jupiter.api.Test
    public void isNotNull() {
        assertNotNull(nullAccount);
    }

    // You can also check if objects are the same.
    @org.junit.jupiter.api.Test
    public void isSame() {
        assertSame(account2, account2);
    }

    // Even though these two objects have the exact same content they do not point to the smae part of memory and therefor will fail.
    @org.junit.jupiter.api.Test
    public void isSame2() {
        assertSame(account2, account3);
    }

    // This can also be done to check for not same.
    @org.junit.jupiter.api.Test
    public void isNotSame() {
        assertNotSame(account2, account3);
    }

    // You can also see if the contents of two arrays are the same.
    @org.junit.jupiter.api.Test
    public void arrayTest() {
        assertArrayEquals(accountArray, accountArray2);
    }

    @org.junit.jupiter.api.AfterAll
    public static void AfterClass() {
        System.out.println("This executes after all test cases only once.");
    }

    @org.junit.jupiter.api.AfterEach
    public void afterEach() {
        System.out.println("This executes after each test case.\n\n\n");
    }
}