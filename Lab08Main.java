/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kamer
 */
// Main.java
// Kameron Ibraheem
// Lab 08: Lab08Main
//
//

import java.util.ArrayList;

public class Lab08Main {
    public static void main(String[] args) {
        ArrayList<Loan> bankLoans = new ArrayList<>();

        Customer c1 = new Customer("ABC", "abc@gmail.com");
        Customer c2 = new Customer("DEF", "def@gmail.com");
        Customer c3 = new Customer("GHI", "ghi@gmail.com");
        Customer c4 = new Customer("JKL", "jkl@gmail.com");

        StudentLoan loan1 = new StudentLoan(c1, 25000.0);
        Mortgage loan2 = new Mortgage(c2, 345000.0);
        StudentLoan loan3 = new StudentLoan(c3, 45000.0);
        Mortgage loan4 = new Mortgage(c4, 150000.0);

        bankLoans.add(loan1);
        bankLoans.add(loan2);
        bankLoans.add(loan3);
        bankLoans.add(loan4);

        for (Loan loan : bankLoans) {
            System.out.println(loan.getBorrower().getName() + ":" + loan.annualInterest() + ":" + loan.monthlyPayment());                                                     
        }
    }
}

