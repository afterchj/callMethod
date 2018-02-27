package com.tpadsz.mytask;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("noSynchronized thread " + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized thread " + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
