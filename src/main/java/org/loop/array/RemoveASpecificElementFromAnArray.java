package org.loop.array;

import java.util.Scanner;

public class RemoveASpecificElementFromAnArray {

    public static void main(String[] args){
        int[] array1 ={10,45,87,90,23,48,32,29};

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number to remove:");
        int num = scanner.nextInt();
        for(int i=0 ;i<array1.length;i++){
            if(array1[i]!=num){
                System.out.println(array1[i]);
            }
        }

    }

}
