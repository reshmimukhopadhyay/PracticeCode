package org.loop.javaFunctionalProgramming;

import java.util.List;
import java.util.Optional;

public class FindMaxEvenNumber {

    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if(numbers==null){
            return 0;
        }

        Optional<Integer> maxNumber = numbers.stream().filter(n->n%2==0).max(Integer::compare);

        return maxNumber.orElse(0);
    }

    public static void main (String[] args){
        List<Integer> numbers = List.of(8,5,3,2,6);
        System.out.println(findMaxEvenNumber(numbers));
    }
}
