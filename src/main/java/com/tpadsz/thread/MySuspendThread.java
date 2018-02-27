package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MySuspendThread extends Thread {
    private long i = 0;

    public void run() {
        while (true) {
            i++;
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        try {
            MySuspendThread thread = new MySuspendThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println(Thread.currentThread().getName() + " end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
