package org.loop.codingWithJava;

public class CalculateSumOfDigitOfNumber {

    public int getSumOfDigits(int number) {
        if(number==0){
            return 0;
        }else if(number<0){
            return -1;
        }

        int sum=0;
        while(number>0){
            int remainder=number%10;
            number=number/10;
            sum=sum+remainder;

        }
        return sum;
    }

    public static void main(String[] args){
        CalculateSumOfDigitOfNumber calculateSumOfDigitOfNumber=new CalculateSumOfDigitOfNumber();
        System.out.println(calculateSumOfDigitOfNumber.getSumOfDigits(34567));
    }
}
