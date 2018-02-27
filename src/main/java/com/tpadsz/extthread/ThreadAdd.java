package com.tpadsz.extthread;

import com.tpadsz.entity.Add;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadAdd extends Thread{
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }
    public void run(){
        p.add();
    }
}
