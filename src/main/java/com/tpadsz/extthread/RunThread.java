package com.tpadsz.extthread;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void run() {
        System.out.println("进入run方法了");
        while (isRunning == true) {
        }
        System.out.println("线程被停止了！");
    }

    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为"+thread.isRunning());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
