package com.tpadsz.condition;

import com.tpadsz.mylist.Test2;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyRun {

    public static void main(String[] args) {
        test2();
    }
    public static void test1(){
        MyService service=new MyService(true);
        service.serviceMethod1();
    }
    public static void test2(){
        final MyService service=new MyService(true);
        Runnable runnable= () -> service.serviceMethod3();
        Thread[] threads=new Thread[10];
        for (int i=0;i<threads.length;i++){
            threads[i]=new Thread(runnable);
            threads[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("有线程数 "+service.lock.getQueueLength()+" 在等待获取锁！");
    }
}
