package com.netcracker.tasks.three.part.one;

public class CashRegister {

    private double purchase;
    private double payment;
    private double taxRate;
    private double taxablePurchase;
    private static double balance;
    private int countItems;

    public CashRegister() {
    }

    public CashRegister(double purchase, double payment) {
        this.purchase = purchase;
        this.payment = payment;
    }

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    public CashRegister(double purchase, double payment, double taxRate) {
        this.purchase = purchase;
        this.payment = payment;
        this.taxRate = taxRate;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        ++countItems;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase - taxablePurchase - getSalesTax();
        purchase = 0;
        payment = 0;
        countItems = 0;
        return change;
    }

    public void recordTaxablePurchase(double amount) {
        taxablePurchase += amount;
    }

    public double getSalesTax() {
        return taxablePurchase * taxRate/100;
    }

    public void bankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static double getBalance() {
        return balance;
    }
}
