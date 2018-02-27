package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyRun {
    public static void main(String[] args) {
        try {
            final MySynchronizedObject object = new MySynchronizedObject();
            Thread thread1 = new Thread(() ->
                    object.printString()
            );
            thread1.setName("a");
            thread1.start();
            thread1.sleep(1000);

            Thread thread2 = new Thread() {
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法！只打印1个beginning...");
                    System.out.println("因为printString()方法被a线程锁定并且永远被suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
