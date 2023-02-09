package chapter3Exercises;

public class Account {

    private String accountNumber;
    private double balance;




    public static void transfer(Account samAccount, Account otherAccount, double amount) {
        otherAccount.deposit(amount);
        samAccount.withdraw(amount);
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0)

        {this.balance = balance + depositAmount;}

    }

    public double getBalance() {
        return balance;
    }


    public void withdraw(double amount){
        if (amount < balance && amount > 0){
        balance = balance - amount;}

        if (balance == amount){
            balance = 0;
        }

    }

}
