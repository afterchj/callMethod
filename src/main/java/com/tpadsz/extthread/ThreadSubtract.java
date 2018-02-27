package com.tpadsz.extthread;

import com.tpadsz.entity.Subtract;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadSubtract extends Thread{
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r=r;
    }
    public void run(){
        r.subtract();
    }
}
