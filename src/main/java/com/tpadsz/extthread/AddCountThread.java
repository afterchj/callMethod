package com.tpadsz.extthread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread countThread = new AddCountThread();
        Thread t1 = new Thread(countThread);
        t1.start();
        Thread t2 = new Thread(countThread);
        t2.start();
        Thread t3 = new Thread(countThread);
        t3.start();
    }
}
