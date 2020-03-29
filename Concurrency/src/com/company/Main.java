package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("This application will show multiple threads running concurrently\n" +
                "Key: \n" +
                "1 = threads binary calculator random integer is even.\n" +
                "0 = threads binary calculator random integer is odd.\n" +
                "X = thread has finished execution.\n" +
                "\nExecution will begin shortly...\n\n");

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }


        ExecutorService myService = Executors.newFixedThreadPool(5);

        Threads process1 = new Threads("|X| | | | |", 1, 600);
        Threads process2 = new Threads("| |X| | | |", 3, 500);
        Threads process3 = new Threads("| | |X| | |", 5, 400);
        Threads process4 = new Threads("| | | |X| |", 7, 300);
        Threads process5 = new Threads("| | | | |X|", 9, 200);

        myService.execute(process1);
        myService.execute(process2);
        myService.execute(process3);
        myService.execute(process4);
        myService.execute(process5);

        myService.shutdown();
    }
}
