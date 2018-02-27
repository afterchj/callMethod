package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("This.getName=" + this.getName());
        System.out.println("This.isAlive=" + this.isAlive());
        System.out.println("CountOperate---end");
    }

    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("This.getName=" + this.getName());
        System.out.println("This.isAlive=" + this.isAlive());
        System.out.println("run---end");
        System.out.println();
    }

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main beginning t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main ending t1 isAlive=" + t1.isAlive());
    }
}
