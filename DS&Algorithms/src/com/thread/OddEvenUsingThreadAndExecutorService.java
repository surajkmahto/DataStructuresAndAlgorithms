package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenUsingThreadAndExecutorService {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Thread oddThread = new Thread(new PrintOdd(1000000));
        Thread evenThread = new Thread(new PrintEven(1000000));
        executor.submit(oddThread);
        executor.submit(evenThread);
        //oddThread.run();
        //evenThread.run();
    }

    static class PrintOdd implements Runnable
    {
        private int max;

        PrintOdd(int maximum){
            max = maximum;
        }

        @Override
        public void run() {
            for(int i=1;i<=max;i+=2){
                System.out.println("Odd Thread" + Thread.currentThread().getId() + "----" + i + " ");
            }
        }
    }

    static class PrintEven implements Runnable
    {
        private int max;

        PrintEven(int maximum){
            max = maximum;
        }

        @Override
        public void run() {
            for(int i=2;i<=max;i+=2){
                System.out.println("Even Thread" + Thread.currentThread().getId() + "----" + i + " ");
            }
        }
    }
}
