package org.loop.javapractice1;

import java.util.Arrays;

public class DemoPracticeArray {

    public static void main(String[] args){
       // int[] numbers = new int[5];
       // numbers[0]=2;
       // numbers[2]=5;

        //Other process to declare the array

        int [] numbers ={2,4,1,3,5};

        //System.out.println(numbers); O/P--> [I@7ad041f3

       System.out.println(Arrays.toString(numbers));

        //sorting an array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
    }
}
