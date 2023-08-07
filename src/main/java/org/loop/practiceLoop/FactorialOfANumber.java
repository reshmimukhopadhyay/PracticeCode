package org.loop.practiceLoop;

public class FactorialOfANumber {

    int givenNumber = 7, fact = 1;
    int temp = givenNumber;

    public void factorialOfANumberWithWhileLoop() {

        while (givenNumber > 1) {
            fact = fact * givenNumber;
            givenNumber = givenNumber - 1;
        }

        System.out.println("Factorial of " + temp + " is " + fact);
    }

    public void factorialOfANumberWithForLoop1() {
        for (int i = givenNumber; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + temp + " is " + fact);
    }

    public void factorialOfANumberWithForLoop2() {
        for (int i = 1; i <= givenNumber; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + temp + " is " + fact);
    }
}
