package org.loop.array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to calculate the average value of array elements.
public class ArrayContainsSpecificElement {

    public boolean checkSpecificElementPresent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        System.out.print("Enter "+count+" numbers: ");
        int[] numbers = new int[count];

        for(int i=0;i<count;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.print("Enter the number to check availability: ");
        int availableNumber = scanner.nextInt();

        for(int number:numbers){
            if(availableNumber==number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayContainsSpecificElement arrayContainsSpecificElement = new ArrayContainsSpecificElement();
        System.out.println("Specific element present= "+arrayContainsSpecificElement.checkSpecificElementPresent());
    }
}
