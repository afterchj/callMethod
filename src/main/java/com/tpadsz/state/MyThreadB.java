package com.tpadsz.state;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyThreadB extends Thread {

    public void run() {
        MyService.serviceMethod();
    }
}
