package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread1 extends Thread {
    public MyThread1() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
