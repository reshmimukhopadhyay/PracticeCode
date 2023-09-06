package org.loop.javaFunctionalProgramming;

import java.util.function.Function;

public class AcceptFunction implements Function<String, Integer> {
    public Integer apply(String element){

        return element.length();
    }
}
