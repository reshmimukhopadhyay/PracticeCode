package org.loop.javapractice1;

import java.util.Scanner;

public class CompareNumber {

    public void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        /*if(number1==number2 && number1==number3){
            System.out.println("All numbers are equal");
        }else if(number1!=number2 && number1!=number3 && number2!=number3){
            System.out.println("All numbers are different");
        }else if(number1==number2 && number1!=number3){
            System.out.println("Neither all are equal or different");
        }else if(number2==number3 && number2!=number1){
            System.out.println("Neither all are equal or different");
        }else if(number3==number1 && number3!=number2){
            System.out.println("Neither all are equal or different");
        }*/

        if (number1 == number2 && number1 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 == number2 || number1 == number3 || number2 == number3) {
            System.out.println("Neither all are equal or different");
        } else System.out.println("All numbers are different");
    }
    public static void main(String[] args){
        CompareNumber compareNumber = new CompareNumber();
        compareNumber.compareNumbers();
    }
}
