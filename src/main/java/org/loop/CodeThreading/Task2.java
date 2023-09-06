package org.loop.CodeThreading;

public class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.print("Thread 2 start: ");
        for(int i=11;i<=20;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n Thread 2 end  ");
    }
}
