package Main;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class project018 extends JFrame {
  private static Scanner scan;

    static {
        scan = new Scanner(System.in);
    }
    public static void main(String[] args) {

        System.out.println(" Loan Calculator ");

        System.out.println("Loan principal Amount :");
        double principal = scan.nextDouble();
        if (principal >= 0 ){

        }



        System.out.println("Duration (Months) :" );
        int duration = scan.nextInt();
        System.out.println("Annual Interest Rate :");
        int annualIterestRate = scan.nextInt();
        Loan loan = new Loan(principal ,duration,annualIterestRate);

        System.out.println(" Loan principal Amount  :  " + loan.getPrincipal() + " Rials");
        System.out.println("Duration (Months) :  " + loan.getDuration()+ " Months");
        System.out.println("Annual Interest Rate :  "+ loan.getAnnualInterestRate()+" %");
        System.out.println("Monthly Payment :  " + loan.getMonthlyPayment()+ " Rials");
        System.out.println("Total Payment :   "+ loan.getTotalPayment()+ " Rials");
        System.out.println("Total Interest :   "+ loan.getTotalIntrest()+ " Rials");




    }

}
