package org.loop.loop1;

import java.util.Scanner;

/*Multiplication Table*/
public class ForLoop3 {

    int j;
    public void loop3(){
        System.out.print("Please enter a number=");
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        sc.close();

        for(int i=0;i<=10;i++){
            int k=j*i;
            System.out.println(j+"x"+i+"="+k);
        }

    }
}
