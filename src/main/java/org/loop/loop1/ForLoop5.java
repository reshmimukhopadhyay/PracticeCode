package org.loop.loop1;


import java.util.Scanner;

/*Power*/
public class ForLoop5 {

    int m;
    int n;
    public void loop5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int j = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter second number: ");
        int i = sc1.nextInt();

        System.out.println(j+"^"+i);
        m=j;
        for(int k =1;k<i;k++){
            n=j*m;
            m=n;
        }
        System.out.println("Final answer: "+m);

    }


}
