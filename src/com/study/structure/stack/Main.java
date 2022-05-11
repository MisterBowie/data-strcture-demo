package com.study.structure.stack;

import com.study.structure.queue.ArrayQueue;
import com.study.structure.queue.LoopQueue;
import com.study.structure.queue.Queue;

import java.util.Random;

public class Main {
    //    public static void main(String[] args) {
//        ArrayStack<Integer> stack = new ArrayStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//        stack.pop();
//        System.out.println(stack);
//    }

//    public static void main(String[] args) {
//        LinkListStack<Integer> stack = new LinkListStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//        stack.pop();
//        System.out.println(stack);
//    }

    private static double testStack(Stack<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 400000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        LinkListStack<Integer> linkListStack = new LinkListStack<>();
        double time2 = testStack(linkListStack, opCount);
        System.out.println("ArrayStack: "+time1 + "s");
        System.out.println("LinkListStack: "+time2 + "s");
    }
}
