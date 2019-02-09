package com.namangupta;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully. New Balance: ₹ "+this.balance);
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Money withdrawn successfully. Remaining balance = ₹ "+this.balance);
        }
    }
}
