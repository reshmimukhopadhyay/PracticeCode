package org.loop.practiceLoop;

public class PrimeNumber {

    int n=3;
    int count=0;
    public void givenNumberIsprimeOrNot() {
        for (int i = 1; i <= n; i++) {
            //Checking how many times the if condition is true.
            //If the if condition is more than 2 times(count) true then it is not prime else prime (prime number has only 2 factorials)
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }

}