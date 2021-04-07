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

        Bank obj = new Bank("Nirmal", 1000000);
        obj.deposit(1000000);
        obj.checkValues();
    }
}
