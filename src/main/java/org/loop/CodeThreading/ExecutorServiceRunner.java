package org.loop.CodeThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner{

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.print("\n Thread3 KickedOff  ");
        for(int i=21;i<=30;i++){
            System.out.print(i+" ");
        }

        System.out.print("\n Thread 3 end  ");
        System.out.print("\n Main end  ");

        executorService.shutdown();
    }

}
