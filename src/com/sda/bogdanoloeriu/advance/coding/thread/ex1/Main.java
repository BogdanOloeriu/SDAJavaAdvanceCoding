package com.sda.bogdanoloeriu.advance.coding.thread.ex1;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //cu start, nu run, o aplicatie are mereu un thread principal care se numeste main,dai cu ran o sa ruleze thread ul main
        for (int i = 1; i <= 100; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(new Random().nextInt(2000));
        }
    }
}
