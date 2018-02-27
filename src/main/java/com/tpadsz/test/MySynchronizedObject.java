package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MySynchronizedObject {
    synchronized public void printString() {
        System.out.println("beginning...");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远被suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("ended!");
    }
}
