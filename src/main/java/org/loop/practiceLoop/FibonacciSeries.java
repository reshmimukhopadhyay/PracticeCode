package org.loop.practiceLoop;

public class FibonacciSeries {
    int a=0;
    int j=1;
    public void fibonacci(){
        System.out.print(a+","+j+",");
        for(int i=0;i<=5;i++){
            int k=0;
            a=a+j;
            k=a;
            j=k+j;
            System.out.print(a+","+j+",");


        }
    }
}
