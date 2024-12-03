/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamer
 */
// Loan.java
// Kameron Ibraheem
// Lab 08: Loan
//
//

import java.util.Random;

public abstract class Loan implements Interest {
    private static int lastLoanNo = 10000;
    protected int loanNo;
    protected Customer borrower;
    protected double amount;
    protected int duration;

    public Loan(Customer borrower, double amount) {
        this.borrower = borrower;
        this.amount = amount;
        this.loanNo = lastLoanNo + 5;
        lastLoanNo = this.loanNo;
        this.duration = new Random().nextInt(26) + 5; // Random duration between 5 and 30
    }

    public int getLoanNo() {
        return loanNo;
    }

    public Customer getBorrower() {
        return borrower;
    }

    public void setBorrower(Customer borrower) {
        this.borrower = borrower;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract double monthlyPayment();
}

