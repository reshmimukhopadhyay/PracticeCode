package org.loop.javapractice1;

import java.util.Scanner;

public class PyramidWithANumber {

    public void pyramid(){
        {
            int number;
            int space;
            System.out.print ("Input number of rows : ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();

            space=number+4-1;
            for(int i=1;i<=number;i++)
            {
                for(int x=space;x!=0;x--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
                space--;
            }
        }


    }
    public static void main(String[] args){
        PyramidWithANumber pyramidWithANumber = new PyramidWithANumber();
        pyramidWithANumber.pyramid();
    }
}
