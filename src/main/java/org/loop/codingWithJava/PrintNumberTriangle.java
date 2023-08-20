package org.loop.codingWithJava;

public class PrintNumberTriangle {

    int number;
    public PrintNumberTriangle(int number){
        this.number=number;
    }

    public void numberTriangle(){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j + " ");


            }
            System.out.println("");
        }

    }
    public static void main(String[] args){
        PrintNumberTriangle printNumberTriangle=new PrintNumberTriangle(5);
        printNumberTriangle.numberTriangle();
    }
}
