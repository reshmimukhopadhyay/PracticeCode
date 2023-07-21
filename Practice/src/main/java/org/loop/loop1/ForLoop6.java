package org.loop.loop1;

import java.util.Scanner;

/*Reverse a number*/
public class ForLoop6 {

    int m=987,reverse=0,lastDigit;
    public void loop6(){
        System.out.println(m);
        while(m>0){
            lastDigit=m%10;
            reverse=reverse*10+lastDigit;
            System.out.println(reverse+"="+reverse+"x"+10+"+"+lastDigit);
            m=m/10;
           }
        System.out.println("reverse: "+reverse);
        }
    }

