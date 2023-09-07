package org.loop.javapractice1;

//Write a Java program that takes three numbers from the user and prints the greatest number.

/*Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Take 3 inputs
//check greater number
//print greater number
public class GreaterNumber {

    public int findLargestNumber(){
        int largestNumber=0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int number2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter number 3: ");
        int number3 = scanner3.nextInt();

        if(number1>number2 && number1>number3) {
            largestNumber = number1;
            return largestNumber;
        }else if(number2>number1 && number2>number3){
            largestNumber = number2;
            return largestNumber;
        }
        return number3;
    }

    public int findTheGreaterNumber(){
        int largestNumber=0;
        List<Integer> number = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        for(int i=0;i<=2;i++){
            number.add(scanner.nextInt());
        }
        for(Integer numbers:number){
            while(largestNumber<numbers){
                largestNumber=numbers;
                if(largestNumber>0){
                    continue;
                }

            return largestNumber;}
        }
        return largestNumber;
    }

    public static void main(String[] args){
        GreaterNumber greaterNumber = new GreaterNumber();
        //System.out.println(greaterNumber.findLargestNumber());
        System.out.println(greaterNumber.findTheGreaterNumber());
    }

}
