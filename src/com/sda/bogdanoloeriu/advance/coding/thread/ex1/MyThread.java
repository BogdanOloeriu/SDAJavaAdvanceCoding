package com.sda.bogdanoloeriu.advance.coding.thread.ex1;

/**
 * Create a class that extends the Thread class, e.g. MyThread, overload the run() method so it displays the thread name
 * in the console by reading it from the static method of the current thread: Thread.currentThread().getName()
 * Create a class with the public static void main (String [] args) method.
 * Inside the main method create a type variable of our class created above, e.g.
 * MyThread and initialize the class. Perform the start() method on the variable.
 */

public class MyThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println(Thread.currentThread().getName() + " Is alive!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(Thread.currentThread().getName() + " Is Dead ");


    }
}
