package org.loop.javaFunctionalProgramming;

import java.util.function.Consumer;

public class AcceptConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer element) {
        System.out.println(element);
    }
}
