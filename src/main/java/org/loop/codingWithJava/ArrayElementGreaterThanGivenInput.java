package org.loop.codingWithJava;

public class ArrayElementGreaterThanGivenInput {

    public boolean doesHaveElementGreaterThan(int number, int... array) {

        if (array.length == 0) {
            return false;
        }

        for (int arrays : array) {
            if (arrays > number)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayElementGreaterThanGivenInput arrayElementGreaterThanGivenInput = new ArrayElementGreaterThanGivenInput();
        System.out.print(arrayElementGreaterThanGivenInput.doesHaveElementGreaterThan(64,22,54,32,56));
    }
}