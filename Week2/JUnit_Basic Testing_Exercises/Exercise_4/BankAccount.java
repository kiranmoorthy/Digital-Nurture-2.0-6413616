package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double initialAmount) {
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
