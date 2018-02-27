package com.tpadsz.condition;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyService {

    public ReentrantLock lock;

    public MyService(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);

    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁");
        }finally {
            lock.unlock();
        }
    }
    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }
    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod3(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"进入方法");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
