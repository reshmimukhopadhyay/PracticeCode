package org.loop.javapractice1;

import java.util.Scanner;

public class GenerateTriangleWithStar {

    public void startTriangle(){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int terms = scanner.nextInt();
        for(int i=terms;i>=1;i--){
            for(int j = i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        GenerateTriangleWithStar generateTriangleWithStar = new GenerateTriangleWithStar();
        generateTriangleWithStar.startTriangle();
    }

}
