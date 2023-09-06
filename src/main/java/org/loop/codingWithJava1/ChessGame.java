package org.loop.codingWithJava1;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move Up");
    }

    @Override
    public void down() {
        System.out.println("Move Down");
    }

    @Override
    public void left() {
        System.out.println("Move Left");
    }

    @Override
    public void right() {
        System.out.println("Move Right");
    }
}
