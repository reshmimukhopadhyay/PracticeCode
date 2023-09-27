package org.loop.array;

import java.util.Scanner;

//Write a Java program to sum values of an array.
public class SumOfNumbers {

    public int sumOfNumberArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        int sum =0;
        int [] number = new int[count];
        System.out.print("Enter "+count+" numbers: ");

        for(int i=0;i<count;i++){
           number [i] = scanner.nextInt();
           sum = sum+number[i];
        }

        return sum;

    }

    public static void main(String[] args){
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println("Sum= "+sumOfNumbers.sumOfNumberArray());
    }
}
