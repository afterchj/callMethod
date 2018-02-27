package com.tpadsz.entity;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class C {
    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("消费者"+Thread.currentThread().getName()+" waiting了*");
                    lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName()+" running");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
