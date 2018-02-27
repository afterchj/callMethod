package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyThread extends Thread{
    private ConditionService service;
    public MyThread(ConditionService service){
        this.service=service;
    }
    public void run(){
        service.await();
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionService service=new ConditionService();
        MyThread thread=new MyThread(service);
        thread.start();
        Thread.sleep(3000);
        service.signal();
    }
}
