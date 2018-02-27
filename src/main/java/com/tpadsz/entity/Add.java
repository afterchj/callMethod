package com.tpadsz.entity;


import com.tpadsz.mylist.MyList;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock=lock;
    }
    public void add(){
        synchronized (lock){
            MyList.list.add("test");
            lock.notifyAll();
        }
    }
}
