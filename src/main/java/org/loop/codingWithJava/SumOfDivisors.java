package org.loop.codingWithJava;

public class SumOfDivisors {

    int number;
    int sum=0;

    public SumOfDivisors(int number){
        this.number=number;
    }

    public int sumofDivisorsOfGivenNumber(){
        for(int i=2;i<=number-1;i++){ //Exclude 1 and the number.
            if(number%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }

    public static void main (String[] args){
        SumOfDivisors sumOfDivisors=new SumOfDivisors(8);
        System.out.println(sumOfDivisors.sumofDivisorsOfGivenNumber());

    }
}
