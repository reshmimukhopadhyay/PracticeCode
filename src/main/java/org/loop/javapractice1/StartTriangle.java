package org.loop.javapractice1;

import java.util.Scanner;

public class StartTriangle {

    public void starTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int number = scanner.nextInt();
        int space = number+4-1;

        for(int i=1;i<=number;i++){
            for(int x=space;x!=0;x--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
            space--;
        }
        System.out.println("");

    }

    public static void main(String[] args){
        StartTriangle startTriangle = new StartTriangle();
        startTriangle.starTriangle();
    }
}
