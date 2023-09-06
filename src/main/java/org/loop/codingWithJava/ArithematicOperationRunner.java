package org.loop.codingWithJava;

public class ArithematicOperationRunner {

    public static void main(String[] args) {


    ArithmeticOperationsWithInterfaces[] arithmeticOperationsRunner = {new Add(), new Subtract(), new Divide()};
    for(ArithmeticOperationsWithInterfaces runner:arithmeticOperationsRunner)

    {
        System.out.println(runner.perform(10, 30));
    }
    }
}
