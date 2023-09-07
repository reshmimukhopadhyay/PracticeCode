package org.loop.javapractice1;

//Write a Java program to get a number from the user and print whether it is positive or negative.

/*Test Data
        Input number: 35
        Expected Output :
        Number is positive*/

import java.util.Scanner;

//input a number
//check number <0
//if true print negative
//else print positive
public class ValidationOfNegativeNumber {


    public String checkNegativeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number<0){
            return "Negative";
        }
        return "Positive";
    }

    public static void main (String[] args){
        ValidationOfNegativeNumber validationOfNegativeNumber = new ValidationOfNegativeNumber();
        System.out.println(validationOfNegativeNumber.checkNegativeNumber());
    }

}
