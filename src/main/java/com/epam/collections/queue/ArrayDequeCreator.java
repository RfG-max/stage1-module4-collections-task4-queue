package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultArray = new ArrayDeque<>();
        resultArray.add(firstQueue.poll());
        resultArray.add(firstQueue.poll());
        resultArray.add(secondQueue.poll());
        resultArray.add(secondQueue.poll());

        while(firstQueue.size()!=0){
            firstQueue.offer(resultArray.pollLast());
            resultArray.add(firstQueue.poll());
            resultArray.add(firstQueue.poll());

            secondQueue.offer(resultArray.pollLast());
            resultArray.add(secondQueue.poll());
            resultArray.add(secondQueue.poll());
        }
        return resultArray;
    }
}
