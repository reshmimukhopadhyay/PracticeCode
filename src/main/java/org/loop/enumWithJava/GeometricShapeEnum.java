package org.loop.enumWithJava;

public class GeometricShapeEnum {

    public enum Shape{
        SQUARE,
        TRIANGLE,
        RECTANGLE,
        CIRCLE
    }

    public static void main(String[] args){
        Shape geometricShape1 = Shape.CIRCLE;
        Shape geometricShape2 = Shape.TRIANGLE;
        Shape geometricShape3 = Shape.RECTANGLE;
        Shape geometricShape4 = Shape.SQUARE;

        System.out.println(geometricShape1);
        System.out.println(geometricShape2);
        System.out.println(geometricShape3);
        System.out.println(geometricShape4);

    }
}
