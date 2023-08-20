package org.loop.codingWithJava;

public class SumOfNumbers {

    int number;
    int sum;
    public SumOfNumbers(int number){
        this.number=number;
        this.sum=sum;
    }

    public int sumOfNumbersUptoTen(){
        for(int i=1;i<=number;i++){
            this.sum = this.sum+i;
        }
        return sum;
    }

    public static void main(String[] args){
        SumOfNumbers sumOfNumbers= new SumOfNumbers(5);
        System.out.println(sumOfNumbers.sumOfNumbersUptoTen());
    }
}
