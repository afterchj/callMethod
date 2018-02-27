package com.tpadsz.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue == true) {
                System.out.println(Thread.currentThread().getName()+"\t"+"有可能+ +连续打印");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+"打印+");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (hasValue == false) {
                System.out.println(Thread.currentThread().getName()+"\t"+"有可能- -连续打印");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+"打印-");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
