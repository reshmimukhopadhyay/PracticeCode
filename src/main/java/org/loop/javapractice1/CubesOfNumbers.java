package org.loop.javapractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CubesOfNumbers {

    public void findCubes(){
        int cube = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int number = scanner.nextInt();
        for(int i = 1;i<=number;i++){
           cube = i*i*i;
            System.out.println("Number is : "+i+ " and cube of "+i+" is : "+cube);
        }

    }
    public static void main(String[] args){

        CubesOfNumbers cubesOfNumbers = new CubesOfNumbers();
        cubesOfNumbers.findCubes();
    }
}
