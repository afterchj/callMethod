package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class YieldThread extends Thread {
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
           if (Thread.currentThread().getName().equals("Thread-b")){
               Thread.yield();
           }
            count = count + (i + 1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"用时："+(endTime-beginTime)+"毫秒！");
    }

    public static void main(String[] args) {
        YieldThread thread1=new YieldThread();
        thread1.setName("Thread-a");
        thread1.start();
        YieldThread thread2=new YieldThread();
        thread2.setName("Thread-b");
        thread2.start();
    }
}
