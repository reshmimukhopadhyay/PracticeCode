package org.loop.CodeThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskNewRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("Ram"), new CallableTask("Montu"), new CallableTask("Sima"));
        //Execute all and then get the result;
        //List<Future<String>> result = executorService.invokeAll(tasks);
          String  result =executorService.invokeAny(tasks);

        /*for(Future<String> results:result){
            System.out.println(results.get());
        }*/

        System.out.println(result);
        executorService.shutdown();
    }
}
