package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class OddEvenUsingThreadAndSharedPrinter {

    public static void main(String[] args) {
        SharedPrinter sp = new SharedPrinter();
        Thread oddThread = new Thread(new PrintOdd(sp,1000));
        Thread evenThread = new Thread(new PrintEven(sp, 1000));
        evenThread.start();
        oddThread.start();
    }

    static class SharedPrinter{
        Semaphore semaphore = new Semaphore(1);
        synchronized void printEven(int num)
        {
            System.out.println("Even Thread" + Thread.currentThread().getId() + "----" + num + " ");
        }

        synchronized void printOdd(int num)
        {
            System.out.println("Odd Thread" + Thread.currentThread().getId() + "----" + num + " ");
        }
    }

    static class PrintOdd implements Runnable
    {
        private SharedPrinter sharedPrinter;
        private int max;

        PrintOdd(SharedPrinter sp, int maximum){
            max = maximum;
            sharedPrinter = sp;
        }

        @Override
        public void run() {
            for(int i=1;i<=max;i+=2){
                sharedPrinter.printOdd(i);
            }
        }
    }

    static class PrintEven implements Runnable
    {
        private SharedPrinter sharedPrinter;
        private int max;

        PrintEven(SharedPrinter sp, int maximum){
            max = maximum;
            sharedPrinter = sp;
        }

        @Override
        public void run() {
            for(int i=2;i<=max;i+=2){
                sharedPrinter.printEven(i);
            }
        }
    }
}
