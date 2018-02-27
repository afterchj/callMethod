package com.tpadsz.test;

import com.tpadsz.runnable.MyRunnable;
import com.tpadsz.thread.MyThread;
import com.tpadsz.thread.MyThread1;
import com.tpadsz.thread.RandomThread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class Test {
    public static void main(String[] args) {
        test3();
//        testRun();
    }


    public static void test1() {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }

    public static void test2() {
        RandomThread randomThread = new RandomThread();
        randomThread.setName("myThread");
        randomThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                randomThread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testRun() {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }

    public static void test3(){
        MyThread1 thread1=new MyThread1();
//        thread1.start();
        thread1.run();
    }

}
