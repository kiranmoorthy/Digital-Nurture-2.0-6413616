package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    // ✅ Setup method: runs BEFORE each test
    @Before
    public void setUp() {
        account = new BankAccount(1000); // Arrange
        System.out.println("Setting up BankAccount with initial balance 1000");
    }

    // ✅ Teardown method: runs AFTER each test
    @After
    public void tearDown() {
        account = null;
        System.out.println("Tearing down BankAccount after test");
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(400);

        // Assert
        assertEquals(600, account.getBalance(), 0.001);
    }
}
