package org.loop.array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to find the maximum and minimum value of an array.
public class MaxAndMinValueInAnArray {

    public int getMaxValue(){
        System.out.println("Find max number from an array");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of elements: ");
        int count = scanner.nextInt();
        int [] number = new int[count];
        System.out.print("Enter the "+count+" elements: ");

        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
        }
        int maximum = 0;
        for(int numbers: number){
            if(maximum<numbers){
                maximum=numbers;
            }
        }
        return maximum;
    }

    public int getMinValue(){
        System.out.println("Find min number from an array");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of elements: ");
        int count = scanner.nextInt();
        int[] number = new int[count];

        System.out.print("Enter the "+count+" elements: ");

        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
        }

        int minimum = Integer.MAX_VALUE;
        for(int numbers:number){
            if(minimum>numbers){
                minimum=numbers;
            }

        }
        return minimum;

    }

    public static void main(String[] args){
        MaxAndMinValueInAnArray maxAndMinValueInAnArray = new MaxAndMinValueInAnArray();
        //System.out.println("maximum value: "+maxAndMinValueInAnArray.getMaxValue());
        System.out.println("minimum value: "+maxAndMinValueInAnArray.getMinValue());
    }
}
