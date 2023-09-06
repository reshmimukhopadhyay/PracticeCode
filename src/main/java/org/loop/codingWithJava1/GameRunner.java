package org.loop.codingWithJava1;

public class GameRunner {

    public static void main(String [] args){
        //GamingConsole game = new ChessGame();
        GamingConsole game = new MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
