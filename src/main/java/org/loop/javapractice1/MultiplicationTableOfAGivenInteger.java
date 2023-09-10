package org.loop.javapractice1;

import java.util.Scanner;


//Write a Java program to display the multiplication table of a given integer.
//
//        Test Data
//        Input the number (Table to be calculated) : Input number of terms : 5
//        Expected Output :
//
//        5 X 0 = 0
//        5 X 1 = 5
//        5 X 2 = 10
//        5 X 3 = 15
//        5 X 4 = 20
//        5 X 5 = 25

public class MultiplicationTableOfAGivenInteger {


    public void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated) : " );
        int number = scanner.nextInt();
        System.out.print("Input number of terms : ");
        int terms = scanner.nextInt();

        for(int i =1;i<=terms;i++){
            System.out.println(number+" X "+i+" = "+(number*i));
        }
    }
    public static void main(String[] args){
        MultiplicationTableOfAGivenInteger multiplicationTableOfAGivenInteger = new MultiplicationTableOfAGivenInteger();
        multiplicationTableOfAGivenInteger.multiplicationTable();
    }
}
