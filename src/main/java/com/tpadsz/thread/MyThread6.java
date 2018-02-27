package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyThread6 extends Thread {
    public void run(){
        super.run();
        try {
            System.out.println("run beginning");
            Thread.sleep(20000);
            System.out.println("run ended");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止！进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread6 thread6=new MyThread6();
            thread6.start();
            thread6.sleep(200);
            thread6.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
