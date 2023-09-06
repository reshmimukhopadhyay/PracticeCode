package org.loop.codingWithJava;

public class FindTheLastDigitOfANumber {

    public int getLastDigit(int number) {
        // Write your code here

        if(number<0){
            return -1;
        }

        return number%10;
    }

    public static void main(String[] args){
        FindTheLastDigitOfANumber findTheLastDigitOfANumber=new FindTheLastDigitOfANumber();
        System.out.println(findTheLastDigitOfANumber.getLastDigit(34567));
    }
}
