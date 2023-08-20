package org.loop.codingWithJava;

public class Dimension {
    private int feet;
    private int inches;

    public Dimension (int inches) {
        if(inches<0){
            this.feet=-1;
            this.inches=-1;
        }else {
            this.feet=inches/12;
            this.inches=inches%12;
        }
    }


    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public static void main(String[] args){
        Dimension dimension=new Dimension(45);
        System.out.println(dimension.getFeet());
        System.out.println(dimension.getInches());
    }
}
