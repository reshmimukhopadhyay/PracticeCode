package org.loop.codingWithJava;

public class FindLCMOfTwoNumbers {

    private int number1;
    private int number2;

    public FindLCMOfTwoNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }


    public int getNumber2() {
        return number2;
    }

    public int calculateLCM() {
        // TODO: Write your code here

        if(number1==0 || number2==0){
            return 0;
        }else if(number1<0 || number2<0){
            return -1;
        }


        int max = Math.max(number1,number2);
        int lcm=max;
        while(true){
            boolean isFinalLcm=lcm%number1==0 && lcm%number2==0;
            if(isFinalLcm){
                return lcm;
            }
            lcm+=max;
        }}

    public static void main(String[] args) {
        FindLCMOfTwoNumbers findLCMOfTwoNumbers = new FindLCMOfTwoNumbers(20, 40);
        System.out.println(findLCMOfTwoNumbers.calculateLCM());
    }
}
