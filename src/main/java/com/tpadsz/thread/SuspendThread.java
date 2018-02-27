package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class SuspendThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    public void run() {
        while (true) {
            i++;
        }
    }

    public static void main(String[] args) {
        try {
            SuspendThread thread = new SuspendThread();
            thread.start();
            Thread.sleep(5000);
            //A段
            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            //B段
            thread.resume();
            Thread.sleep(5000);
            //C段
            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
