package org.loop.codingWithJava;

import java.util.Arrays;

public class ArrayReverse {
    public int[] reverseArray(int... array) {

        if(array.length<=1){
            return array;
        }

        int [] reverse= new int[array.length];
        int start=0;
        int end = array.length-1;
        while(start<end){
            reverse[start]=array[end];
            reverse[end]=array[start];
            start++;
            end--;

        }

        return reverse;
    }

    public static void main(String[] args){
        ArrayReverse arrayReverse = new ArrayReverse();
        System.out.println(Arrays.toString(arrayReverse.reverseArray(3,4,5,6,7)));
    }
}
