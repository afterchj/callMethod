package com.tpadsz.entity;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock=lock;
    }
    public void setValue(){
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者"+Thread.currentThread().getName()+" waiting了*");
                    lock.wait();
                }
                System.out.println("生产者"+Thread.currentThread().getName()+" running");
                String value=System.currentTimeMillis()+"_"+System.nanoTime();
//                System.out.println("set的值是："+value);
                ValueObject.value=value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
