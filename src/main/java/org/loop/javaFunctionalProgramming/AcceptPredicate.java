package org.loop.javaFunctionalProgramming;

import java.util.function.Predicate;

public class AcceptPredicate implements Predicate<Integer> {

    public boolean test(Integer element){

        if(element%2==1) {
            return true;
        }

        return false;
    }

}
