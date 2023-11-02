package org.loop.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementToSpecificPositions {

    public static void main(String[] args){
        int [] arr1={1,4,2,3,5,0,9};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter index where you want to add number:");
        int index = scanner.nextInt();

        System.out.println("Enter the number which you want to insert:");
        int number = scanner.nextInt();
        int[] arr2 = new int[arr1.length+1];
        for(int i=0;i<index;i++){
            arr2[i]=arr1[i];
            arr2[i+1]=number;
            for(int j=i+2;j<=arr1.length;j++) {
                arr2[j] = arr1[j-1];
            }
        }

        System.out.println("arr1: "+ Arrays.toString(arr1));
        System.out.println("arr2: "+ Arrays.toString(arr2));
        //System.out.println("temp: "+ Arrays.toString(temp));



    }
}
