package org.loop.javapractice1;

import java.util.Scanner;

/*Write a Java program to print Floyd's Triangle.

        Test Data
        Input number of rows : 5
        Expected Output :

        Input number of rows :  5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15*/
public class FloydTriangle {

    public void triangleNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int term = scanner.nextInt();
        int k=1;
        for(int i =1;i<=term;i++){

            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        FloydTriangle rightAngleTriangleWithANumber = new FloydTriangle();
        rightAngleTriangleWithANumber.triangleNumber();
    }
}
