package org.loop.array;

import java.util.Scanner;

//Write a Java program to calculate the average value of array elements.

public class AverageValueOfArrayElements {

    public int averageOfArrayElements(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        System.out.print("Enter "+count+" numbers: ");
        int[] numbers = new int[count];
        int sum = 0;
        for(int i=0;i<count;i++){
            numbers[i] = scanner.nextInt();
            sum = sum+numbers[i];
        }
        return sum/count;
    }

    public static void main(String[] args){
        AverageValueOfArrayElements averageOfArrayElements = new AverageValueOfArrayElements();
        System.out.println("Average= "+averageOfArrayElements.averageOfArrayElements());
    }
}
