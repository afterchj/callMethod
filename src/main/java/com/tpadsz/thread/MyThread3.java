package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread3 extends Thread {
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " beginning =" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread3 thread3 = new MyThread3();
        System.out.println("beginning =" + System.currentTimeMillis());
        thread3.start();
        System.out.println("ending =" + System.currentTimeMillis());
    }
}
