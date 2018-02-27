package com.tpadsz.service;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ServiceTest {
    private Lock lock=new ReentrantLock();

    public void methodA(){
       try {
           lock.lock();
           for (int i=0;i<5;i++){
               System.out.println("methodA begin ThreadName="+Thread.currentThread().getName()+"\t"+System.currentTimeMillis());

               Thread.sleep(5000);
               System.out.println("methodA end ThreadName="+Thread.currentThread().getName()+"\t"+System.currentTimeMillis());

           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }finally {
           lock.unlock();
       }
    }
    public void methodB(){
        try {
            lock.lock();
            for (int i=0;i<5;i++){
                System.out.println("methodB begin ThreadName="+Thread.currentThread().getName()+"\t"+System.currentTimeMillis());

                Thread.sleep(5000);
                System.out.println("methodB end ThreadName="+Thread.currentThread().getName()+"\t"+System.currentTimeMillis());

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
