package org.loop.codingWithJavaCollections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessWithQueueRunner {

    public static void main(String[] args){
        Queue<String> queue= new PriorityQueue<>(new ProcessWithQueue());
        queue.addAll(List.of("Grape","WaterMelon","Peer","Pomagranate"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
