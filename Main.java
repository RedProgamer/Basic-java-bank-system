package com.company;
import java.util.*;

class Bank {
    static String name;
    static int balance;

    public Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int value) {
        if(value > 1000 && value < balance)
            balance -= value;
        else
            System.out.println("Value not Compatible");
    }

    public void deposit(int value) {
        if(value > 1000 && value < (int)Math.pow(10, 6))
            balance += value;
        else
            System.out.println("Value not Compatible");
    }

    public void checkValues() {
        System.out.println("Name : " + name + "\n" + "Balance : " + balance);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myname;
        int balance;

        System.out.print("Enter your name : ");
        myname = sc.nextLine();

        System.out.print("Enter your bank balance : ");
        balance = sc.nextInt();

        //Creating Bank object
        Bank obj = new Bank(myname, balance);

        //Depositing money
        obj.deposit(100000);

        //Withdrawing money
        obj.withdraw(10000);

        //Checking values
        obj.checkValues();
    }
}
