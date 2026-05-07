package com.quenedy.oop;

class BankAccount {
    //Private Field - encapsulated!
    private final String owner;
    private double balance;

    //Constructor
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    //Getters
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    //Setters with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal check your balance first");

        }
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

        }


   class BankReport {
       void generateReport(BankAccount account) {
           String owner = account.getOwner();
           double balance = account.getBalance();

           System.out.printf("%-10s | $%.2f%n", owner, balance);

       }
   }

public class Encapsulation {
    public static void main (String[] args) {

        BankAccount account = new BankAccount("Quenedy", 2000.0);
        account.displayInfo();

        //Valid operation
        account.deposit(500.0);
        account.withDraw(1100.0);

        //Invalid operations -protected by encapsulations!
        account.deposit(-100);
        account.withDraw(99999.0);

        System.out.println();
        account.displayInfo();

       BankReport report = new BankReport();
       report.generateReport(account);
    }
}




