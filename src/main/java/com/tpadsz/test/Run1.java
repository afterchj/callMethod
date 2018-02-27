package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class Run1 {
    public static void main(String[] args) {
        Thread runThread=Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+" "+runThread.getId());
    }

}
