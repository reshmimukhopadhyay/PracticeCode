package org.loop.loop1;

import java.util.Scanner;

public class Loop7 {

    int a, b, hcf, k,i;

    public void loop7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter 2nd number: ");
        b = sc1.nextInt();
        int n = 1;
        for ( i = 1; i <= 10; i++) {

            if (a % i == 0 && b % i == 0) {
                if (k < i) {
                    k=i;
                }
                System.out.println("n= " + n);
            }

        }

    }
}