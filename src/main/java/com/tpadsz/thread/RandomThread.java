package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class RandomThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
