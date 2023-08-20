package org.loop.codingWithJava;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if(side<=0){
            return -1;
        }else{
            int areaOfSquare=side*side;
            return areaOfSquare;}
    }

    public int calculatePerimeter() {
        if(side<=0){
            return -1;
        }else{
            int perimeterOfSquare = 4*side;
            return perimeterOfSquare;}
    }

    public static void main(String[] args){
        Square square=new Square(3);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }

}
