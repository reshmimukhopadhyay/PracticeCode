package org.loop.CodeThreading;

public class CodeWithRunnable implements Runnable{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        for(int i=11;i<=20;i++){
            System.out.print(i+" ");
        }

    }


    public static void main(String[] args){
        CodeWithRunnable cwt = new CodeWithRunnable();
        Thread thread = new Thread(cwt);
        thread.start();

        System.out.print("\n");
        for(int i=21;i<=30;i++){
            System.out.print(i+" ");
        }
    }
}
