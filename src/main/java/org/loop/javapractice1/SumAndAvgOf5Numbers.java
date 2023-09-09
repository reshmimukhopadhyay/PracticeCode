package org.loop.javapractice1;

import java.util.Scanner;
/*
Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        Test Data
        Input the 5 numbers : 1 2 3 4 5
        Expected Output :


        Input the 5 numbers :
        1
        2
        3
        4
        5
        The sum of 5 no is : 15
        The Average is : 3.0
*/
public class SumAndAvgOf5Numbers {

    public void sumAndAvg(){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        for(int i=1;i<=5;i++){
            System.out.print("Enter "+i+" number: ");
             int number= scanner.nextInt();
             sum=sum+number;
        }

        double avg = sum/5;
        System.out.println("Sum= "+sum+", average= "+avg);
    }

    public static void main (String[] args){
        SumAndAvgOf5Numbers sumAndAvgOf5Numbers = new SumAndAvgOf5Numbers();
        sumAndAvgOf5Numbers.sumAndAvg();
    }
}
