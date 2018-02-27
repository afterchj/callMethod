package com.tpadsz.lock;

import com.tpadsz.service.ServiceTest;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class MyThread extends Thread {
    private ServiceTest service;

    public MyThread(ServiceTest service) {
        this.service = service;
    }

    public void run() {
        service.methodA();
    }

    public static void main(String[] args) {
        ServiceTest service = new ServiceTest();
        MyThread t1 = new MyThread(service);
        MyThread t2 = new MyThread(service);
        MyThread t3 = new MyThread(service);
        MyThread t4 = new MyThread(service);
        MyThread t5 = new MyThread(service);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
