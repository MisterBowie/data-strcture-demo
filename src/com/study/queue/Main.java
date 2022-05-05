package com.study.queue;

import java.util.Random;

public class Main {
    private static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime-startTime) / 1000000000.0;
    }
    public static void main(String[] args) {
        int opCount = 400000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 =testQueue(arrayQueue,opCount);
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 =testQueue(loopQueue,opCount);
        System.out.println(time1);
        System.out.println(time2);
    }

    // loop 测试
   /* public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    } */
}
