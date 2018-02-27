package com.tpadsz.entity;

import com.tpadsz.mylist.MyList;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class Subtract {
    private String lock;
    public Subtract(String lock){
        super();
        this.lock=lock;
    }
    public void subtract(){
        try {
            synchronized (lock){
                while (MyList.size()==0){
                    System.out.println("wait begin Thread "+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end Thread "+Thread.currentThread().getName());
                }
                MyList.list.remove(0);
                System.out.println("list size="+MyList.list.size());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
