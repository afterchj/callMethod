package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class ThreadA extends Thread {
    private MyConditionService service;

    public ThreadA(MyConditionService service){
        this.service=service;
    }
    public void run(){
        service.awaitA();
    }
}
