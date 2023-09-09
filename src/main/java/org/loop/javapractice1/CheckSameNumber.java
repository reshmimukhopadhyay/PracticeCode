package org.loop.javapractice1;

//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;

/*Test Data
        Input floating-point number: 25.586
        Input floating-point another number: 25.589
        Expected Output :
        They are different*/
public class CheckSameNumber {

    public String checkSameNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        Float number1 = scanner.nextFloat();

        System.out.print("Enter number 2: ");
        Float number2 = scanner.nextFloat();
        System.out.println(number1.floatValue());
        if(number1.equals(number2)){
            return "They are same";
        }

        return "They are different";
    }
    public static void main(String[] args){
        CheckSameNumber checkSameNumber = new CheckSameNumber();
        System.out.println(checkSameNumber.checkSameNumber());
    }
}
