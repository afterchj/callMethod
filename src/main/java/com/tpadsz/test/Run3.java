package com.tpadsz.test;

import com.tpadsz.thread.MyThread4;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class Run3 {
    public static void main(String[] args) {
       test2();
    }
    public static void test1(){
        try {
            MyThread4 thread4 = new MyThread4();
            thread4.start();
            Thread.sleep(1000);
            thread4.interrupt();
            System.out.println("是否已经停止1？=" + thread4.interrupted());
            System.out.println("是否已经停止2？=" + thread4.interrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
    public static void test2(){
        try {
            MyThread4 thread4 = new MyThread4();
            thread4.start();
            Thread.sleep(1000);
            thread4.interrupt();
            System.out.println("是否已经停止1？=" + thread4.isInterrupted());
            System.out.println("是否已经停止2？=" + thread4.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
