/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamer
 */
// Mortgage.java
// Kameron Ibraheem
// Lab 08: Mortgage
//
//

public class Mortgage extends Loan {
    private double apr;

    public Mortgage(Customer borrower, double amount) {
        super(borrower, amount);
        this.apr = FIX_RATE + 1.5;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    @Override
    public double annualInterest() {
        return apr * getAmount();
    }

    @Override
    public double monthlyPayment() {
        return ((annualInterest() + (getAmount() / getDuration())) / 12) * 1.03;
    }
}

