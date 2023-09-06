package org.loop.CodeThreading;

public class CodeWithThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }



    public static void main(String[] args){
        CodeWithThread cwt = new CodeWithThread();
        cwt.start();
        System.out.print("\n");
        for(int i=11;i<=20;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        for(int i=21;i<=30;i++){
            System.out.print(i+" ");
        }

    }
}
