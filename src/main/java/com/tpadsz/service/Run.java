package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyConditionService service = new MyConditionService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
