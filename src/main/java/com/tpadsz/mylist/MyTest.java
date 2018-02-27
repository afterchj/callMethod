package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyTest {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ListThreadA a=new ListThreadA(lock);
            a.start();
            Thread.sleep(50);
            ListThreadB b=new ListThreadB(lock);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
