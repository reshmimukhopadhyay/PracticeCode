package org.loop.array;

import java.util.Scanner;

public class FindIndexOfAnArrayElement {

    public static void main(String[] args){
        int[] arr1 = {23,65,78,90,76,56};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find the index:");
        int num = scanner.nextInt();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==num){
                System.out.println("Index is:"+i);
            }
        }
    }
}
