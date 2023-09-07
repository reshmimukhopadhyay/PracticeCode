package org.loop.javapractice1;

import java.util.Scanner;

public class UseOfScanner {

    public void simpleScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        byte number = scanner.nextByte();
        System.out.println("Number: "+number);
    }

    public void simpleStringScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.println(name);
    }
    public static void main(String[] args){
      UseOfScanner useOfScanner =new UseOfScanner();
      useOfScanner.simpleScanner();
      useOfScanner.simpleStringScanner();


    }
}
