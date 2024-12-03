/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamer
 */
// StudentLoan.java
// Kameron Ibraheem
// Lab 08: StudentLoan
//
//

public class StudentLoan extends Loan {
    private double reduceInterest;

    public StudentLoan(Customer borrower, double amount) {
        super(borrower, amount);
        this.reduceInterest = FIX_RATE - 0.03;
    }

    public double getReduceInterest() {
        return reduceInterest;
    }

    public void setReduceInterest(double reduceInterest) {
        this.reduceInterest = reduceInterest;
    }

    @Override
    public double annualInterest() {
        return reduceInterest * getAmount();
    }

    @Override
    public double monthlyPayment() {
        return (annualInterest() + (getAmount() / getDuration())) / 12;
    }
}

