package org.loop.array;

import java.util.Arrays;
public class ArraySort {
        public static void main(String[] args){
            int[] numberArray = {45,12,66,2,9,3,123,0};
            String[] stringArray ={"java","ayan","koyel","kobir","devid"};

            System.out.println(Arrays.toString(numberArray));
            Arrays.sort(numberArray);
            System.out.println("sorted 1: " + Arrays.toString(numberArray));

            System.out.println("=======================");

            System.out.println(Arrays.toString(stringArray));
            Arrays.sort(stringArray);
            System.out.println("sorted 2: " + Arrays.toString(stringArray));



        }
}
