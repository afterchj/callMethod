package com.tpadsz.extthread;

import com.tpadsz.service.PrivateNum;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class TestAB {
    public static void main(String[] args) {
        PrivateNum numRef1=new PrivateNum();
        PrivateNum numRef2=new PrivateNum();
        ThreadA a=new ThreadA(numRef1);
        a.start();
        ThreadB b=new ThreadB(numRef2);
        b.start();
    }
}
