package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread4 extends Thread {
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()){
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
