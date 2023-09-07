package org.loop.javapractice1;

import java.util.Scanner;

public class FizzBuzzConditionalStatement {


    public void fizzBuzz(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        if(number%5==0 || number%10==0){
            System.out.println("Fizz");
        } else if (number%3==0) {
            System.out.println("Buzz");
        } else if (number%3==0 && number%5==0) {
            System.out.println("FizzBuzz");
        } else
            System.out.println(number);
    }
    public static void main(String[] args){
        FizzBuzzConditionalStatement fizzBuzzConditionalStatement = new FizzBuzzConditionalStatement();
        fizzBuzzConditionalStatement.fizzBuzz();
    }
}
