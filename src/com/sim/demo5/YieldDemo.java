package com.sim.demo5;

public class YieldDemo implements Runnable
{
    public void run()
    {
        System.out.println("Started " + Thread.currentThread());
        // calling yield() method on current thread to move it
        // back to ready state from running state
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }
    public static void main (String[] args)
    {
        YieldDemo y1 = new YieldDemo();
        // creating first thread
        Thread t1 = new Thread(y1, "First child thread");
        
        YieldDemo y2 = new YieldDemo();
        // creating first thread
        Thread t2 = new Thread(y1, "Second child thread");
        
        // assigning priority to threads
        t1.setPriority(4);
        t2.setPriority(8);
        
        // calling thread will execute run() function
        t1.start();
        t2.start();
    }
}
