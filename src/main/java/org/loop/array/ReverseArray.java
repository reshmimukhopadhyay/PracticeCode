package org.loop.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to reverse an array of integer values.
public class ReverseArray {

    public void reverseAnArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of elements: ");

        int count = scanner.nextInt();
        System.out.println("Enter "+count+" elements: ");
        int[] number = new int[count];

        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
        }
        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]) ;

        }
    }

    public static void main(String[] args){
        ReverseArray reverseArray=new ReverseArray();
        reverseArray.reverseAnArray();
    }
}
