package com.tpadsz.state;



/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyThread1 extends Thread {

    public void run(){
        try {
            System.out.println("begin sleep");
            Thread.sleep(1000);
            System.out.println("\tend sleep");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread1 t=new MyThread1();
            t.start();
            Thread.sleep(1000);
            System.out.println("Main方法中的状态："+t.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
