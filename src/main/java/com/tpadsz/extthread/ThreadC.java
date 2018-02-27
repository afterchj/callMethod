package com.tpadsz.extthread;

import com.tpadsz.entity.C;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadC extends Thread {
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }
    public void run(){
        while (true){
            r.getValue();
        }
    }
}
