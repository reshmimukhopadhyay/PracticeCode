package org.loop.codingWithJava;

public class ReverseANumber {

    public int reverseNumber(int number) {
        if(number==0){
            return 0;
        }else if(number<0){
            return -1;
        }

        int reverse=0;
        while(number>0){
            int remainder = number%10;
            reverse=reverse*10+remainder;
            number=number/10;

        }
        return reverse;
    }

    public static void main(String[] args){
        ReverseANumber reverseANumber=new ReverseANumber();
        System.out.println(reverseANumber.reverseNumber(34567));
    }
}
