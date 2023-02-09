package Chapter8.TimeClassExercise.BankApp;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;

    public Account(String pin) {
        this.pin = pin;
    }

    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    public BigDecimal getBalance(String pin) {
        if(!this.pin.equalsIgnoreCase(pin)) throw new IllegalArgumentException("Invalid Pin");
        return balance;
    }

    public void withdraw(BigDecimal amount, String pin) {
        if(!this.pin.equalsIgnoreCase(pin)) throw new IllegalArgumentException("Invalid Pin");
        balance=balance.subtract(amount);
    }
}
