package org.loop.array;

import java.util.Scanner;

public class FindSpecificNumber {

    public static void main(String[] args){
        int[] array1={23,23,54,12,67};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check the availability: ");
        int number = scanner.nextInt();

        for(int i=0;i<array1.length;i++){
            if(number==array1[i]){
                System.out.println("Number Matched");
            }
        }

    }
}
