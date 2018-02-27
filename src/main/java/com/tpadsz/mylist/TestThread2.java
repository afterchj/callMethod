package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class TestThread2 extends Thread {
    private Object lock;

    public TestThread2(Object lock) {
        super();
        this.lock = lock;
    }

    public void run() {
       synchronized (lock){
           System.out.println("开始 notify time=" + System.currentTimeMillis());
           lock.notify();
           System.out.println("结束 notify time=" + System.currentTimeMillis());
       }
    }
}
