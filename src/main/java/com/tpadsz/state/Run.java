package com.tpadsz.state;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class Run {
    public static void main(String[] args) {
        MyThreadA t1=new MyThreadA();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("a");
        t1.start();
        MyThread t2=new MyThread();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setName("b");
        t2.start();
        System.out.println("main方法中t1的状态："+t1.getState());
        System.out.println("main方法中t2的状态："+t2.getState());
    }
}
