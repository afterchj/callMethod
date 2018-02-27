package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyThread8 extends Thread {
    private int i;

    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread8 thread = new MyThread8();
            thread.start();
            thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
