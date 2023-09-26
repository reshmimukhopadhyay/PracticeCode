package org.loop.exceptionPractice;

import java.util.Scanner;

public class BusinessArithematicException {

    public String businessArithematic(){
        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number%2==1){
           throw new ArithmeticException();
        }
        return "Number is even";
    }

    public static void main(String[] args){
        BusinessArithematicException businessArithematicException = new BusinessArithematicException();
        System.out.println(businessArithematicException.businessArithematic());
    }
}
