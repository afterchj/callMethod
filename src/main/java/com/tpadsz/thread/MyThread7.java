package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyThread7 extends Thread {
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run beginning");
            Thread.sleep(20000);
            System.out.println("run ended");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep！进入catch！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread7 thread = new MyThread7();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
