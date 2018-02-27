package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class Test12 {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            TestThread1 t1 = new TestThread1(lock);
            t1.start();
            Thread.sleep(3000);
            TestThread2 t2 = new TestThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
