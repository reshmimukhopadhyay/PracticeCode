package org.loop.javapractice1;

import java.util.Scanner;

/*Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

        The pattern is as follows :

        1
        22
        333
        4444*/
public class RightAngleTriangleWithSameNumber {

    public void triangleWithSameNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        for(int i=1;i<=terms;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){

        RightAngleTriangleWithSameNumber rightAngleTriangleWithSameNumber = new RightAngleTriangleWithSameNumber();
        rightAngleTriangleWithSameNumber.triangleWithSameNumber();

    }
}
