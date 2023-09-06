package org.loop.codingWithJava1;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Up Arrow");
    }

    @Override
    public void down() {
        System.out.println("Down Arrow");
    }

    @Override
    public void left() {
        System.out.println("Left Arrow");
    }

    @Override
    public void right() {
        System.out.println("Right Arrow");
    }
}
