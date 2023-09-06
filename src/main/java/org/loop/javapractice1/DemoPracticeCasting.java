package org.loop.javapractice1;

public class DemoPracticeCasting {

    public static void main(String[] args){
        short x=1;
        int y= x+2;
        System.out.println(y); // implicit casting

        double x1=1.1;
        int y1 = (int)x1+2; //explicit casting
        System.out.println(y1);

        String x2 = "1";
        int y2 =Integer.parseInt(x2)+2;
        System.out.println(y2);
    }
}
