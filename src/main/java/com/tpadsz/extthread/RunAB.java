package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class RunAB {
    public static void main(String[] args) {
        LockObject object = new LockObject();
        MyThreadA a = new MyThreadA(object);
        a.setName("A");
//        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        MyThreadB b = new MyThreadB(object);
        b.setName("B");
//        b.setPriority(Thread.MAX_PRIORITY);
        b.start();
    }
}
