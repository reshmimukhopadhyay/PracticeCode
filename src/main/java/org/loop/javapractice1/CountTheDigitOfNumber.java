package org.loop.javapractice1;

import java.util.Scanner;

public class CountTheDigitOfNumber {

    public void countTheNumberOfDigit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int quotient=0;
        int count = 0;
        while(number%10!=0){
            quotient=number/10;
            number=quotient;
            if(number>=0){

            count++;

            }

        }

        System.out.println("Number of digits in the number: "+count);
    }
    public static void main(String[] args){
        CountTheDigitOfNumber countTheDigitOfNumber = new CountTheDigitOfNumber();
        countTheDigitOfNumber.countTheNumberOfDigit();

    }
}
