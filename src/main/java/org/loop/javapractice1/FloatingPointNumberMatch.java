package org.loop.javapractice1;

import java.util.Scanner;

public class FloatingPointNumberMatch {

    public String floatingPointNumberMatch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first floatingpoint number: ");
        float number1=scanner.nextFloat();

        System.out.print("Input second floatingpoint number: ");
        float number2=scanner.nextFloat();

        if(Math.abs(number1-number2)<=0.01){
            return "These numbers are not different.";
        }
        return "These numbers are different.";
    }

    public static void main(String[] agrs){
        FloatingPointNumberMatch floatingPointNumberMatch = new FloatingPointNumberMatch();
        System.out.println(floatingPointNumberMatch.floatingPointNumberMatch());
    }
}
