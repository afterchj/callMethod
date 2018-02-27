package com.tpadsz.extthread;

import com.tpadsz.entity.P;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }
    public void run(){
        while (true){
            p.setValue();
        }
    }
}
