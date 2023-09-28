package org.loop.array;

//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Scanner;



public class SortArrayNumericAndString {

    public void numericArraySort() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of numeric value: ");
        int count = scanner.nextInt();

        int[] number = new int[count];

        System.out.print("Enter " + count + " elements: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }

    public void StringArraySort(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of string value: ");
        int count = scanner.nextInt();

        String[] stringValue = new String[count];
        System.out.print("Enter " + count + " string elements: ");

        for(int i=0;i<stringValue.length;i++){
            stringValue[i]=scanner.next();
        }
        Arrays.sort(stringValue);
        System.out.println(Arrays.toString(stringValue));
    }

    public static void main(String[] args){
        SortArrayNumericAndString sortArrayNumericAndString = new SortArrayNumericAndString();
        sortArrayNumericAndString.numericArraySort();
        sortArrayNumericAndString.StringArraySort();
    }
}
