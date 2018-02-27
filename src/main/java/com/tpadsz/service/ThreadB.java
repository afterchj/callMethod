package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class ThreadB extends Thread {
    private MyConditionService service;

    public ThreadB(MyConditionService service) {
        this.service = service;
    }

    public void run() {
        service.awaitB();
    }
}
