package org.loop.codingWithJava;

import org.loop.practiceLoop.PrimeNumber;

public class PrimeNumberCheck {
    boolean prime = true;
    int number;
    public PrimeNumberCheck(int number){
        this.number= number;
    }

    public boolean isPrime(){
        if(this.number<2){
            prime = false;
        }else {
            for (int i = 2; i <= number - 1; i++) {
                if (this.number % i == 0) {
                    prime = false;
                }

            }
        }
        return prime;
    }

    public static void main(String[] args){
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck(8);
        System.out.print(primeNumberCheck.isPrime());
    }
}
