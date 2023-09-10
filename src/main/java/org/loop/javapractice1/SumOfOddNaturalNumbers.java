package org.loop.javapractice1;

import java.util.Scanner;

/*
Write a Java program that displays the sum of n odd natural numbers.

        Test Data
        Input number of terms is: 5
        Expected Output :

        The odd numbers are :
        1
        3
        5
        7
        9
        The Sum of odd Natural Number upto 5 terms is: 25
*/
public class SumOfOddNaturalNumbers {


    public void sumofOddNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of terms: ");
        int terms = scanner.nextInt();
        int sum =0;
        for(int i=1;i<=terms;i++){
            int oddNumber = 2*i-1;
            System.out.println(oddNumber);
            sum = sum +oddNumber;

            }
        System.out.println(sum);
        }

    public static void main(String[] args){
        SumOfOddNaturalNumbers sumOfOddNaturalNumbers = new SumOfOddNaturalNumbers();
        sumOfOddNaturalNumbers.sumofOddNumbers();
    }
}
