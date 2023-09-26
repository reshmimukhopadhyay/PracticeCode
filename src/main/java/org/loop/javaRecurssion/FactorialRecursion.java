package org.loop.javaRecurssion;

public class FactorialRecursion {

    int x=1;
    public int factorialOfANumber(int n){


        if (n<=0){
            return 1;
        }
        return n*factorialOfANumber(n-1);


    }


    public static void main(String[] args){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        System.out.println(factorialRecursion.factorialOfANumber(5));
    }
}
