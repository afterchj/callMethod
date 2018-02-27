package com.tpadsz.extthread;

import com.tpadsz.entity.C;
import com.tpadsz.entity.P;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class RunPC {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        P p=new P(lock);
        C r=new C(lock);
        ThreadP[] threadP=new ThreadP[2];
        ThreadC[] threadC=new ThreadC[2];
        for (int i=0;i<2;i++){
            threadP[i]=new ThreadP(p);
            threadP[i].setName("生产者"+(i+1));
            threadC[i]=new ThreadC(r);
            threadC[i].setName("消费者"+(i+1));
            threadP[i].start();
            threadC[i].start();
        }
       Thread.sleep(5000);
        Thread[] threads=new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        for (int i=0;i<threads.length;i++){
            System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getState());
        }
    }
}
