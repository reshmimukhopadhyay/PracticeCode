package org.loop.codingWithJava;

import java.util.Scanner;

public class CubeOfANumberDWhile {

    int number;
    public CubeOfANumberDWhile(int number){
        this.number=number;
    }

    public void cubeOfNumber(){

        Scanner scanner = new Scanner(System.in);
        int number=0;

        do{
            System.out.println(number*number*number);
            System.out.println("Enter Number: ");
            number = scanner.nextInt();


        }while(number>=0);

        System.out.println("Thank You");
    }

    public static void main(String[] args){
        CubeOfANumberDWhile cubeOfANumberDWhile = new CubeOfANumberDWhile(9);
        cubeOfANumberDWhile.cubeOfNumber();
    }


}
