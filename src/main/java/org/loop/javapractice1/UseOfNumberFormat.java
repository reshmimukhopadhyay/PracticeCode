package org.loop.javapractice1;

import java.text.NumberFormat;

public class UseOfNumberFormat {


    public void currencyFormat() {
        String currency = NumberFormat.getCurrencyInstance().format(2345678.9876);
        //String currencyResult = currency.format(2345678.9876);
        System.out.println(currency);
    }

    public void percentageFormat(){
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result = percentage.format(0.2);
        System.out.println(result);
    }
    public static void main(String[] args) {
        UseOfNumberFormat useOfNumberFormat = new UseOfNumberFormat();
        useOfNumberFormat.currencyFormat();
        useOfNumberFormat.percentageFormat();
    }
}