package org.loop.codingWithJava;

public class ArraySumOfTwoArray {


    private int[] array1;
    private int[] array2;

    public ArraySumOfTwoArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        if(sum1==sum2){
            return true;
        }
        return false;
    }

    private int calculateSum(int[] array) {
        int sum=0;
        for(int valueOfArray:array){
            sum = sum+valueOfArray;
        }

        return sum;

    }
    public static void main(String[] args){
        int[] array1 = {1,3,2,5};
        int[] array2 = {4,3,3,5};
        ArraySumOfTwoArray arraySumOfTwoArray=new ArraySumOfTwoArray(array1,array2);
        System.out.println(arraySumOfTwoArray.areSumsEqual());
    }


}
