package com.tpadsz.mytask;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class Thread2 extends Thread {

    private Task task;

    public Thread2(Task task) {
        super();
        this.task = task;
    }

    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
