package com.namangupta;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(123456);
        account1.setBalance(5000);
        account1.setCustomerName("Raghuveer");
        account1.setEmail("raghuveer@abc.xyz");
        account1.setPhone(987613468);
        System.out.println("Customer Name: " + account1.getCustomerName() +
                "\nAccount Number: " + account1.getAccountNumber() +
                "\nBalance: ₹ " + account1.getBalance() +
                "\nEmail: " + account1.getEmail() +
                "\nPhone no.: +(91) - " + account1.getPhone());
        account1.deposit(3500);
        account1.withdraw(10000);


    }
}
