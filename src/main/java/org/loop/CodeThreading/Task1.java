package org.loop.CodeThreading;

public class Task1 extends Thread{
    public void run(){
        System.out.print("Thread 1 start: ");
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Thread 1 end  ");
    }
}
