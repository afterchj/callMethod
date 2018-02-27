package com.tpadsz.extthread;

import com.tpadsz.service.PrivateNum;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class ThreadB extends Thread {
    private PrivateNum numRef;

    public ThreadB(PrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    public void run() {
        super.run();
        numRef.addI("b");
    }
}
