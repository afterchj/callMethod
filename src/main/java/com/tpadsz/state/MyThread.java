package com.tpadsz.state;


/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法中的状态："+Thread.currentThread().getState());

    }
    public void run(){
        System.out.println("Run方法中的状态："+Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        try {
            MyThread t=new MyThread();
            System.out.println("Main方法中的状态1："+t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("Main方法中的状态2："+t.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
