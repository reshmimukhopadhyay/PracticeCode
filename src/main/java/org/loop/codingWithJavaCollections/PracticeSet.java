package org.loop.codingWithJavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PracticeSet {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(54678);
        numbers.add(78);
        numbers.add(3456);
        numbers.add(90);
        numbers.add(456);
        numbers.add(78);
        numbers.add(90);

        Set<Integer> linkedNumbers = new LinkedHashSet<>();
        linkedNumbers.add(54678);
        linkedNumbers.add(78);
        linkedNumbers.add(3456);
        linkedNumbers.add(90);
        linkedNumbers.add(456);
        linkedNumbers.add(78);
        linkedNumbers.add(90);

        Set<Integer> treeNumbers = new TreeSet<>();
        treeNumbers.add(54678);
        treeNumbers.add(78);
        treeNumbers.add(3456);
        treeNumbers.add(90);
        treeNumbers.add(456);
        treeNumbers.add(78);
        treeNumbers.add(90);

        System.out.println("HashSet: "+numbers);
        System.out.println("LinkedHashSet: "+linkedNumbers);
        System.out.println("TreeSet: "+treeNumbers);
    }
}
