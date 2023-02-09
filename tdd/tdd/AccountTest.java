package tdd;

import chapter3Exercises.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {


        @Test
        public void accountExistence(){
            Account samAccount = new Account();
            assertNotNull(samAccount);}


        @Test
         public void depositTest(){
            Account samAccount = new Account();
            samAccount.deposit(5000);
            samAccount.getBalance();
            assertEquals(5000, samAccount.getBalance());
            }

            @Test

            public void transferTest(){
            Account samAccount = new Account();
            Account otherAccount = new Account();
            samAccount.deposit(15000);
            Account.transfer(samAccount, otherAccount, 5000);
            otherAccount.getBalance();
            samAccount.getBalance();
             assertEquals(5000, otherAccount.getBalance());
             assertEquals(10000, samAccount.getBalance());


            }




        }


