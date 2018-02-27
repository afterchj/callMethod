package com.tpadsz.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyCallable {

    public static void main(String[] args) throws Exception {
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                Thread thread = new Thread(task);
                thread.start();
            }
        }
        System.out.println("当前线程返回的值：" + task.get());
    }
}
