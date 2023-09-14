package org.loop.javapractice1;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class CheckNegativeZeroPositive {

    public void checkNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("Number is Positive");
        }

        if(number==0){
            System.out.println("Number is Zero");
        }

        if(number<0){
            System.out.println("Number is negative");
        }

    }


    public static void main(String[] args){
        CheckNegativeZeroPositive checkNegativeZeroPositive = new CheckNegativeZeroPositive();
        checkNegativeZeroPositive.checkNumber();
    }
}
