package com.example.nycone57.atm2016;

/**
 * Created by NYC ONE57 on 11/4/2016.
 */
import java.util.Scanner;

public class AccountTester {
    public static void main(String []args){

        CheckingAccount mikeChecking = new CheckingAccount(1000,12345);
        CheckingAccount mikeSavings = new CheckingAccount(1000,12345);
        mikeChecking.deposit(1000);
        mikeSavings.deposit(500);
        Scanner inputpin= new Scanner (System.in);
        System.out.println("please enter your pin number.");
        int in=inputpin.nextInt();
        if (in==0001){
            System.out.println("Welcome mike , please select C for checking or S for Savings");
        }else {
            throw new IllegalArgumentException("invalid Id number");

        }

        Scanner actype= new Scanner (System.in);
        String input=actype.nextLine();
        if (input.equalsIgnoreCase("C")){
            System.out.println("Your checking balance is" +" " +mikeChecking.getBalance());
            System.out.println("Select D for deposit or W for withdraw");
            input=actype.nextLine();
        }if(input.equalsIgnoreCase("D")){
            Scanner deposit = new Scanner(System.in);
            System.out.println("enter amount:");
            double amountD=deposit.nextDouble();
            mikeChecking.deposit(amountD);
            System.out.println("your new balance is " +" "+mikeChecking.getBalance());
        } if (input.equalsIgnoreCase("W")){
            System.out.println("enter amount:");
            Scanner withdraw = new Scanner(System.in);
            double amountD=withdraw.nextDouble();
            mikeChecking.withdraw(amountD);
            System.out.println("your new balance is " +" "+mikeChecking.getBalance());
        }
        if (input.equalsIgnoreCase("S")){
            System.out.println("Your Savings balance is" +" " +mikeSavings.getBalance());
            System.out.println("Select DS for deposit or WS for withdraw");
            input=actype.nextLine();
        }if (input.equalsIgnoreCase("DS")){
            Scanner deposit = new Scanner(System.in);
            System.out.println("enter amount:");
            double amountD=deposit.nextDouble();
            mikeSavings.deposit(amountD);
            System.out.println("your new balance is " +" "+mikeSavings.getBalance());
        }else if (input.equalsIgnoreCase("WS")){
            System.out.println("enter amount:");
            Scanner withdraw = new Scanner(System.in);
            double amountD=withdraw.nextDouble();
            mikeSavings.withdraw(amountD);
            System.out.println("your new balance is " +" "+mikeSavings.getBalance());
        }

    }}

