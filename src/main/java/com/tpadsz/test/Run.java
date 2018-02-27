package com.tpadsz.test;

import com.tpadsz.thread.ALogin;
import com.tpadsz.thread.BLogin;
import com.tpadsz.thread.CountOperate;
import com.tpadsz.thread.MyThread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class Run {
    public static void main(String[] args) {
//        testLogin();
        test2();
    }

    public static void test1() {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }

    public static void testLogin() {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

    public static void test2() {
        CountOperate operate = new CountOperate();
        Thread t1 = new Thread(operate);
        Thread t2 = new Thread(operate);
        t2.setName("B");
        t1.setName("A");
        t1.start();
        t2.start();

    }
}
