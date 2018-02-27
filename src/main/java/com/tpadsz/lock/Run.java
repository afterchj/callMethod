package com.tpadsz.lock;

import com.tpadsz.service.ServiceTest;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class Run {
    public static void main(String[] args) {
        ServiceTest service = new ServiceTest();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();

    }
}
