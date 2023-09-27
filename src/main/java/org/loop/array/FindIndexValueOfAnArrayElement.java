package org.loop.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

//Write a Java program to find the index of an array element.
public class FindIndexValueOfAnArrayElement {

    public int findIndexOfElementPresent(int[] numbers, int num) {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num){
                return i;
            }
        }
         return 0;
    }
    public static void main(String[] args){
        FindIndexValueOfAnArrayElement findIndexValueOfAnArrayElement = new FindIndexValueOfAnArrayElement();
        int[] array = {4,3,5,6,7};
        System.out.println("Index is : "+findIndexValueOfAnArrayElement.findIndexOfElementPresent(array,3));

    }
}
