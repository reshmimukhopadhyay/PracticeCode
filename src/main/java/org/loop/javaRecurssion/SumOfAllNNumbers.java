package org.loop.javaRecurssion;

public class SumOfAllNNumbers {

    public int sumOfNnumbers(int n){
        if(n<=1){
            return 1;
        }

        return n+sumOfNnumbers(n-1);
    }

    public static void main (String[] args){
        SumOfAllNNumbers sumOfAllNNumbers = new SumOfAllNNumbers();
        System.out.println(sumOfAllNNumbers.sumOfNnumbers(5));
    }
}
