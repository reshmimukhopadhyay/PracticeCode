package org.loop.javapractice1;

import java.util.Scanner;

public class StarDiamond {

    public void triangleOfStar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        for(int i = 0;i<=row-1;i++){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void lowerTriangleOfStar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();

        for(int i=row-1;i>=1;i--){

            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        StarDiamond starDiamond = new StarDiamond();
        //starDiamond.triangleOfStar();
        //starDiamond.lowerTriangleOfStar();
        starDiamond.rightTriangle();



    }
}
