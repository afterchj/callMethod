package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class TestThread1 extends Thread {
    private Object lock;
    public TestThread1(Object lock){
        super();
        this.lock=lock;
    }
    public void run(){
        try {
           synchronized (lock){
               System.out.println("开始 wait time="+System.currentTimeMillis());
               lock.wait();
               System.out.println("结束 wait time="+System.currentTimeMillis());
           }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
