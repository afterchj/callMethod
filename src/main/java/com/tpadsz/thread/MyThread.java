package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread extends Thread {
    private int count = 5;

//    public StopThread(String name) {
//        super();
//        this.setName(name);
//    }

   synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);

//        while (count > 0) {
//            count--;
//        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);

//        }
//        System.out.println("myThread");
    }
}
