package org.loop.codingWithJava;

import java.util.Scanner;

public class ChooseOperation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int number1=scanner.nextInt();

        System.out.println("Enter 2nd number:");
        int number2= scanner.nextInt();

        System.out.println("Choice 1: Addition");
        System.out.println("Choice 2: Multiplication");
        System.out.println("Choice 3: Division");
        System.out.println("Choice 1: Subtraction");


        System.out.println("Enter choice:");
        int choice= scanner.nextInt();



        System.out.println("Entered 1st number: "+number1);
        System.out.println("Entered 2nd number: "+number2);
        System.out.println("Entered 2nd number: "+choice);

        if(choice==1){
            int result = number1+number2;
            System.out.println("Addition: "+result);
        }else if(choice==2){
            int result = number1*number2;
            System.out.println("Multiply: "+result);
        } else if (choice==3) {
            int result;
            if(number1>number2){
            result = number1/number2;}
            else {
                result=number2/number1;
            }
            System.out.println("Division: "+result);
        }else if (choice==4) {
            int result;
            if(number1>number2){
                result = number1-number2;}
            else {
                result=number2-number1;
            }
            System.out.println("Subtraction: "+result);
        }

    }
}
