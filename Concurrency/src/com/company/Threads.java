package com.company;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Threads implements Runnable {

    private String thread;
    private int sleep;
    private int rand;
    private int index;
    AtomicInteger value = new AtomicInteger(0);
    private int binaryCalc;

    Random random = new Random();

    public Threads(String thread, int index, int sleep) {

        this.thread = thread;
        this.sleep = sleep;
        this.index = index;

        this.rand = random.nextInt(250);
    }

    public void run() {
        System.out.println("\n\nExecuting " + thread + "Sleep between prints = " + sleep);
        for (int count = 1; count < rand; count++) {
            binaryCalc = random.nextInt(100);
            if (binaryCalc % 2 == 0) {
                value.incrementAndGet();
                String output = thread.substring(0,index) + "0" + thread.substring(index+1);
                System.out.print(output + "\n");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
            else {
                value.incrementAndGet();
                String output = thread.substring(0,index) + "1" + thread.substring(index+1);
                System.out.print(output + "\n");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
        }
        System.out.println(thread + " This thread printed " + value + " times");
    }
}