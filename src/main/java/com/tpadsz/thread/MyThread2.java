package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread2 extends Thread {
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " beginning");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        System.out.println("beginning =" + System.currentTimeMillis());
        thread2.run();
        System.out.println("ending =" + System.currentTimeMillis());
    }
}
