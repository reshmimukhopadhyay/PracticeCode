package org.loop.javapractice1;

import java.util.Arrays;

public class DemoPractice2DArray {

    public static void main(String[] agrs){
        int [][] numbers = new int[2][3];
        numbers[0][0]=1;
        numbers[0][1]=4;
        numbers[0][2]=3;
        numbers[1][0]=9;
        numbers[1][1]=5;
        numbers[1][2]=6;
        System.out.println(Arrays.deepToString(numbers));
    }
}
