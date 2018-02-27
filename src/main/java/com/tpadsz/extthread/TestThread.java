package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class TestThread extends Thread{

    public  void run(){
        try {
            int secondValue= (int) (Math.random()*10000);
            System.out.println(getName()+"\t"+secondValue);
            Thread.sleep(secondValue);
        }catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        thread.start();
        thread.join();
//        Thread.sleep(1000);
        System.out.println("threadTest结束后，"+Thread.currentThread().getName()+"再执行");
    }
}
