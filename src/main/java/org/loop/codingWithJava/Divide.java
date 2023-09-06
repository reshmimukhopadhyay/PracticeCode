package org.loop.codingWithJava;

public class Divide implements ArithmeticOperationsWithInterfaces{
    public int perform(int x, int y) {
        // Write your code here
        int divide=0;
        if(y>0){
            divide = x/y;
            return divide;
        }return -1;
    }
}
