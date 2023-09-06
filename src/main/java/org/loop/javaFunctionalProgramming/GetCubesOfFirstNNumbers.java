package org.loop.javaFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetCubesOfFirstNNumbers {

    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here

        return IntStream.range(1,n+1).map(e->e*e*e).boxed().collect(Collectors.toList());
    }

    public static void main (String[] args){
        System.out.println(getCubesOfFirstNNumbers(5));
    }
}
