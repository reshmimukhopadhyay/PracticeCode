package org.loop.loop1;

import java.util.Scanner;

/*Factorial*/
public class ForLoop4 {

    int j;
    public void loop4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        j= sc.nextInt();

        for(int i = 1;i<=20;i++){
            if(j%i==0){
                System.out.println("factorial: "+i);
            }

        }
    }
}
