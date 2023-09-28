package org.loop.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

    public void removeElement(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of element: ");
        int count = scanner.nextInt();

        int [] number = new int[count];
        System.out.print("Enter " + count + " elements: ");
        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(number));

        System.out.println("Enter the index number to delete the value from array: ");
        int indexNumber= scanner.nextInt();
        for(int i=indexNumber;i<number.length-1;i++){
            number[i]=number[i+1];

        }
        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args){

        RemoveElementFromArray removeElementFromArray=new RemoveElementFromArray();
        removeElementFromArray.removeElement();


    }
}
