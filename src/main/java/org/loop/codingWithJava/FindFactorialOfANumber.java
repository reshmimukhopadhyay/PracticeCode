package org.loop.codingWithJava;

public class FindFactorialOfANumber {

    public int calculateFactorial(int number) {
        // Write your code here
        if(number>=0){
            int factorial =1;
            for(int i=number;i>0;i--){
                factorial=factorial*i;

            }
            return factorial;
        }

        return -1;
    }

    public static void main(String[] args) {
        FindFactorialOfANumber factorialOfANumber = new FindFactorialOfANumber();
        System.out.println(factorialOfANumber.calculateFactorial(5));
    }

}
