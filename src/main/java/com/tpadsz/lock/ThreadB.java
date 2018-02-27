package com.tpadsz.lock;

import com.tpadsz.service.ServiceTest;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadB extends Thread {

    private ServiceTest service;

    public ThreadB(ServiceTest service){
        this.service=service;

    }
    public void run(){
        service.methodB();
    }
}
