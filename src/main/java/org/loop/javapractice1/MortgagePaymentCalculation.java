package org.loop.javapractice1;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePaymentCalculation {

    private float annualRateOfInterest;
    private int principal;
    private byte period;

    public final byte MONTHS_IN_YEAR = 12;
    public final byte PERCENT = 100;

    /*public MortgagePaymentCalculation(float rateOfInterest, int principal, byte period){
        this.period=period;
        this.principal = principal;
        this.rateOfInterest = rateOfInterest;
    }*/
    public void loanCalculator(){

        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextInt();
        if(principal>=1000 && principal<=1000000)
            break;
        else{
            System.out.println("Please enter valid principal amount between rupees 1,000 and 1,000,000");
        }
        }

        while(true) {
            System.out.print("Enter the interest rate: ");
            annualRateOfInterest = scanner.nextFloat();
            if(annualRateOfInterest>0&&annualRateOfInterest<=20){
                break;
            }else System.out.println("Please enter valid interest rate between rupees 1 and 20");
        }

        while (true) {
            System.out.print("Enter the period: ");
            period = scanner.nextByte();
            if(period>0 && period<=30){
                break;
            }else System.out.println("Please enter valid period between 1 and 30 years");
        }

        float monthlyRateOfInterest= annualRateOfInterest/PERCENT/MONTHS_IN_YEAR;

        int numberOfPeriods = period*MONTHS_IN_YEAR;

        double mortgage = principal*(
                                    (monthlyRateOfInterest*Math.pow((1+monthlyRateOfInterest),numberOfPeriods))
                                    /(Math.pow((1+monthlyRateOfInterest),numberOfPeriods)));

        //System.out.println(mortgage);
        System.out.println("Motgage: "+NumberFormat.getCurrencyInstance().format(mortgage));



    }

    public static void main(String[] args){
        MortgagePaymentCalculation mortgagePaymentCalculation = new MortgagePaymentCalculation();
        mortgagePaymentCalculation.loanCalculator();


    }
}
