package com.tpadsz.extthread;

import com.tpadsz.entity.PublicVar;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class ThreadA1 extends Thread {
    private PublicVar var;

    public ThreadA1(PublicVar var) {
        super();
        this.var = var;
    }

    public void run() {
        super.run();
        var.setValue("B", "BB");
    }

    public static void main(String[] args) {
        try {
            PublicVar var = new PublicVar();
            ThreadA1 a1 = new ThreadA1(var);
            a1.start();
            Thread.sleep(200);
            var.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
