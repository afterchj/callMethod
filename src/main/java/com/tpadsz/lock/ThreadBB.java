package com.tpadsz.lock;

import com.tpadsz.service.ServiceTest;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadBB extends Thread {

    private ServiceTest service;

    public ThreadBB(ServiceTest service){
        this.service=service;

    }
    public void run(){
        service.methodB();
    }
}
