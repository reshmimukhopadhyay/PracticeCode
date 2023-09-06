package org.loop.javaFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FindOddNumbers {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {


        // Write your code here
        return numbers.stream().filter(element->element%2!=0).collect(Collectors.toList());

    }

    public static void main (String[] args){
        List<Integer> numbers = List.of(-2,-5,-1,-8,0,4,7,5,1);
        System.out.println(filterOddNumbers(numbers));
    }
}
