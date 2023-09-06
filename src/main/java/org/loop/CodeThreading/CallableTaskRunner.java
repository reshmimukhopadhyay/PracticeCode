package org.loop.CodeThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> name = executorService.submit(new CallableTask(" Ram"));
        System.out.println(name.get());
        executorService.shutdown();

    }
}
