package org.loop.javapractice1;

import java.util.Scanner;

public class MultiplicationTableOfAGivenInteger {


    public void multiPlicationTable(){
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
        multiplicationTableOfAGivenInteger.multiPlicationTable();
    }
}
