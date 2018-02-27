package com.tpadsz.test;


import com.tpadsz.mylist.Test2;
import com.tpadsz.tools.Tools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class RunAB {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test2() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值= " + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
