package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class VolatileThread extends Thread {
    volatile public static int count;

     private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    public void run() {
        addCount();
    }

    public static void main(String[] args) {
        VolatileThread[] thread = new VolatileThread[100];
        for (int i = 0; i < 100; i++) {
            thread[i] = new VolatileThread();
        }
        for (int i = 0; i < 100; i++) {
            thread[i].start();
        }
    }
}
