package org.loop.codingWithJava;

public class WhileNumberPlayer {

    int number;
    public WhileNumberPlayer(int number){
        this.number=number;
    }

    public void printSquareUptoLimit() {
        int i = 1;
        while (i * i < number) {
            int square = i * i;
            System.out.print(square + " ");
            i++;
        }
    }

    public void printCubeUptoLimit(){
            int i =1;
            while(i*i*i<number){
                int cube = i*i*i;
                System.out.print(cube+" ");
                i++;
            }
        }


    public static void main(String[] args){
        WhileNumberPlayer whileNumberPlayer=new WhileNumberPlayer(30);
        whileNumberPlayer.printSquareUptoLimit();
        whileNumberPlayer.printCubeUptoLimit();
    }
}
