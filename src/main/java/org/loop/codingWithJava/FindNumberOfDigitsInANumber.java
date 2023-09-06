package org.loop.codingWithJava;

public class FindNumberOfDigitsInANumber {

    public int getNumberOfDigits(int number) {
        if(number==0){
            return 1;
        }else if(number<0){
            return -1;}

        int count = 0;
        while(number>0){
            number=number/10;
            count++;

        }
        return count;
    }

    public static void main(String[] args){
        FindNumberOfDigitsInANumber findNumberOfDigit=new FindNumberOfDigitsInANumber();
        System.out.println(findNumberOfDigit.getNumberOfDigits(34567));
    }
}
