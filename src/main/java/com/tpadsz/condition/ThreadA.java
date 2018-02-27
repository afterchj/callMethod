package com.tpadsz.condition;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service=service;
    }
    public void run(){
        for (int i=0;i<100;i++){
            service.set();
        }
    }
}
