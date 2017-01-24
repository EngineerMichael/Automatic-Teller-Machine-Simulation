package com.example.nycone57.atm2016;

/**
 * Created by NYC ONE57 on 11/4/2016.
 */
public class SavingsAccount extends BankAccount{

    public SavingsAccount( double abalance, int accountNumber) {
        super(abalance, accountNumber);
        // TODO Auto-generated constructor stub
    }
    public void deposit(double amount){
        balance=amount+balance;

    }
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    private double balance;

}