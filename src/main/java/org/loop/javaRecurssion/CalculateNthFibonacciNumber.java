package org.loop.javaRecurssion;

public class CalculateNthFibonacciNumber {

    public int nthFibonacciNumber(int n){

        if (n<=1){
            return n;
        }

        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }

    public static void main(String[] args){
        CalculateNthFibonacciNumber calculateNthFibonacciNumber = new CalculateNthFibonacciNumber();
        System.out.println(calculateNthFibonacciNumber.nthFibonacciNumber(10));
    }
}
