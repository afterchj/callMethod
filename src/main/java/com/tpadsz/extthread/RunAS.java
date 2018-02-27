package com.tpadsz.extthread;

import com.tpadsz.entity.Add;
import com.tpadsz.entity.Subtract;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class RunAS {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        Add add=new Add(lock);
        Subtract subtract=new Subtract(lock);
        ThreadSubtract t1=new ThreadSubtract(subtract);
        t1.setName("subtractThread1");
        t1.start();
        ThreadSubtract t2=new ThreadSubtract(subtract);
        t2.setName("subtractThread2");
        t2.start();
        Thread.sleep(1000);
        ThreadAdd t3=new ThreadAdd(add);
        t3.setName("addThread");
        t3.start();
    }
}
