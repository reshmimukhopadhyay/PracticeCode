package org.loop.array;

import java.util.Arrays;

public class CopyAnArray {

    public static void main(String[] args){
        int[] arr1 = {3,2,5,1,6};
        int[] arr2= new int[arr1.length];

       for(int i=0;i<arr1.length;i++) {
           arr2[i]=arr1[i];
       }
        System.out.println("arr2: "+Arrays.toString(arr2));
    }
}
