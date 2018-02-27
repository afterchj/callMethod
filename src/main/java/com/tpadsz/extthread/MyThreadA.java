package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyThreadA extends Thread {
    private LockObject object;

    public MyThreadA(LockObject object) {
        super();
        this.object = object;
    }

    public void run() {
        super.run();
        object.methodA();
    }
}
