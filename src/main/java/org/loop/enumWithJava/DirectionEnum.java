package org.loop.enumWithJava;

public class DirectionEnum {

    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args){
        Direction direction1 = Direction.EAST;
        Direction direction2 = Direction.NORTH;
        Direction direction3 = Direction.WEST;
        Direction direction4 = Direction.SOUTH;

        System.out.println(direction1);
        System.out.println(direction2);
        System.out.println(direction3);
        System.out.println(direction4);
    }
}
