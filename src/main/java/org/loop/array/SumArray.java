package org.loop.array;

public class SumArray {

    public static void main(String[] args){
        int[] numberArray={20,10,78,93,90};
        int sum=0;
        for(int i=0;i<numberArray.length;i++){
            sum=sum+numberArray[i];
        }

        System.out.println("sum of array: "+sum);
    }
}
