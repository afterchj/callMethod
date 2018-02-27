package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class LockObject {
    synchronized public void methodA() {
        try {
            System.out.println("Begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" +System.currentTimeMillis() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   synchronized public void methodB() {
        try {
            System.out.println("Begin methodB threadName=" + Thread.currentThread().getName()+",begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
