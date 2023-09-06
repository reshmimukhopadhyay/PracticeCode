package org.loop.javaFunctionalProgramming;

import java.util.List;

public class SumOfSquares {

    public static long sumOfSquares(List<Integer> numbers) {

        // Check if the list is null. If so, return 0.

        if(numbers==null){
            return 0;
        }

        // Stream over the list of numbers, find squares and sum them up

        return  numbers.stream().mapToLong(e->e*e).sum();
    }

    public static void main (String[] args){
        List<Integer> numbers = List.of(1,2,2,3);
        System.out.println(sumOfSquares(numbers));
    }
}
