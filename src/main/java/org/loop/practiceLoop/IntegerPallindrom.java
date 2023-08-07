package org.loop.practiceLoop;

public class IntegerPallindrom {

    int givenNumber = 23095788, remainder, quotient, reverseNumber = 0;
    int temp=givenNumber;
    public void integerPallindrom() {
        while (givenNumber > 0) {
            remainder = givenNumber % 10;
            givenNumber = givenNumber / 10;
            reverseNumber = reverseNumber * 10 + remainder;

        }
        if (temp == reverseNumber) {
            System.out.println("It is pallindrom");
        } else
            System.out.println("It is not pallindrom");
    }
}