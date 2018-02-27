package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class DaemonThread extends Thread {
    private int i;

    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(900);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DaemonThread thread=new DaemonThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("唯一前台线程"+Thread.currentThread().getName()+"离开，thread对象也不再打印了，也就是停止了！");
    }
}
