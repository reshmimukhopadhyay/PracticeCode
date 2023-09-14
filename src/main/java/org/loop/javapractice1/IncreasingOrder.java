package org.loop.javapractice1;

import java.util.Scanner;

public class IncreasingOrder {

    public String increasingOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();

        if(number1>number2 && number1>number3 && number2>number3){
            return "Decreasing Order";
        }else if(number1<number2 && number1<number3 && number2<number3){
            return "Increasing Order";
        }
        return "Neither increasing or decreasing order";
    }

    public static void main(String[] args){
        IncreasingOrder increasingOrder = new IncreasingOrder();
        System.out.println(increasingOrder.increasingOrder());
    }
}
