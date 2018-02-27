package com.tpadsz.thread;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class MyThread5 extends Thread {
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
//                break;
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面！");
        } catch (InterruptedException e) {
            System.out.println("进入run方法中的catch了！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.start();
        try {
            Thread.sleep(2000);
            thread5.interrupt();
//            System.out.println("isInterrupted=" + thread5.isInterrupted());
//            System.out.println("interrupted=" + thread5.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
