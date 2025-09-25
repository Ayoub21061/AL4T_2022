package be.ecam.basics.exercises;

import java.util.Objects;
import java.math.BigDecimal; 

public class Account {
    // private double balance;
    private BigDecimal balance;

    public Account() {
        // this(0.0);
        this(BigDecimal.ZERO);
    }

    public Account(double initial) {
        // this.balance = initial;
        this(BigDecimal.valueOf(initial));
    }

    public Account(BigDecimal initial) {
        this.balance = initial;
    }

    public double getBalance() {
        // return balance;
        return balance.doubleValue();
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount");
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount");
        BigDecimal am = BigDecimal.valueOf(amount);
        if (am.compareTo(balance) > 0) throw new IllegalStateException("insufficient");
        balance = balance.subtract(am);
        // if (amount > balance) throw new IllegalStateException("insufficient");
        // balance -= amount;
    }

    public void transferTo(Account other, double amount) {
        Objects.requireNonNull(other, "other");
        withdraw(amount);
        other.deposit(amount);
    }
}
