package exercise3;

// Exercise 3 : The Customer Account
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write class Customer, Account
* date: 08/02/2023
*/

import java.text.DecimalFormat;


public class Account {

	// declaration part 
    private int id;
    private Customer custumer;
    private double balance;

    //constructor 
    public Account(int id, Customer custumer, double balance) {
        super();
        this.id = id;
        this.custumer = custumer;
        this.balance = balance;
    }

    public Account(int id, Customer custumer) {
        super();
        this.balance = 0.0;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustumer() {
        return this.custumer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        //this.custumer.toString() + "balance=$ " + this.balance;
        DecimalFormat df = new DecimalFormat("0.00");
        return this.custumer.toString() + "balance=$" + df.format(this.balance);
    }

    public String getCustumerName() {
        return this.custumer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("\"amount withdrawn\n"
                    + "exceeds the curent balance!\"");
        }

        return this;
    }

}