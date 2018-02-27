package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class AliveThread extends Thread {
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        AliveThread thread = new AliveThread();
        System.out.println("beginning==" + thread.isAlive());
        thread.start();
        thread.sleep(1000);
        System.out.println("ending==" + thread.isAlive());

    }
}
