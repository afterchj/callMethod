package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class StopThread extends Thread {
    private SynchronizedObject objec;

    public StopThread(SynchronizedObject object) {
        super();
        this.objec = object;
    }

    public void run() {
        objec.printString("b", "bb");
    }

    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            StopThread thread = new StopThread(object);
            thread.start();
            thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
