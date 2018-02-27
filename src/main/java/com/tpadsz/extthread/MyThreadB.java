package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyThreadB extends Thread {
    private LockObject object;

    public MyThreadB(LockObject object) {
        super();
        this.object = object;
    }

    public void run() {
        super.run();
        object.methodB();
    }
}
