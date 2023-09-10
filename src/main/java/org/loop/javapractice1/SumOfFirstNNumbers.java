package org.loop.javapractice1;

import java.util.Scanner;

//Write a Java program to display n terms of natural numbers and their sum.
public class SumOfFirstNNumbers {

    public int sumOfFirstNNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number number of terms:");
        int terms = scanner.nextInt();
        int sum = 0;
        for(int i = 1;i<=terms;i++){
            System.out.println(i);
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args){
        SumOfFirstNNumbers sumOfOddNaturalNumbers = new SumOfFirstNNumbers();
        System.out.println(sumOfOddNaturalNumbers.sumOfFirstNNumbers());

    }
}
