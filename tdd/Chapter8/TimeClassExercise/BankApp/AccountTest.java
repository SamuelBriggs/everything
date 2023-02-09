package Chapter8.TimeClassExercise.BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account newAccount;

    @BeforeEach
    public void setUp(){
        newAccount = new Account("1234");
        newAccount.deposit(BigDecimal.valueOf(10_000));
    }

    @Test

    public void depositTest(){

        newAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), newAccount.getBalance("1234"));
    }
    @Test

    public void checkBalanceWithCorrectPin(){
        newAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), newAccount.getBalance("1234"));

    }

    @Test

    public void checkBalanceWithWrongPin(){

        assertThrows(IllegalArgumentException.class, ()-> newAccount.getBalance("2345"));
    }

    @Test
    public void withdrawTest(){
        newAccount.withdraw(BigDecimal.valueOf(3_000), "1234");
        assertEquals(BigDecimal.valueOf(7_000), newAccount.getBalance("1234"));
    }

    @Test

    public void testWithdrawalWithInvalidBalance(){
        newAccount.withdraw(BigDecimal.valueOf(15_000), "1234");


    }

}