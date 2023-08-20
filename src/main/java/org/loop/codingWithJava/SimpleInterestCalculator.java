package org.loop.codingWithJava;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    BigDecimal interest;
    BigDecimal principal;

    public SimpleInterestCalculator(String interest, String principal){
        this.interest=new BigDecimal(interest);
        this.principal=new BigDecimal(principal).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTheTotalValue(int numberOfYears){

        return principal.add(principal.multiply(interest).multiply(new BigDecimal(numberOfYears)));

    }
    public static void main(String[] args) {

        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4.5847","500");
       System.out.println( calculator.calculateTheTotalValue(7));

    }
}
