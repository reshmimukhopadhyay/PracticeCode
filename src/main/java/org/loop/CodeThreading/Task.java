package org.loop.CodeThreading;

import java.util.concurrent.Callable;

public class Task extends Thread {

    private int number;
    public Task(int number){
        this.number=number;
    }
    public void run(){
        System.out.print("\n Task"+number+" Started");

        for(int i=number*10;i<=number*10+9;i++){
            System.out.println(i+" ");
        }

        System.out.print("\n Task"+number+" Started");
    }
}
