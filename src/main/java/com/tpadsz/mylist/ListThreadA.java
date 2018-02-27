package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class ListThreadA extends Thread {

    private Object lock;
    public ListThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
