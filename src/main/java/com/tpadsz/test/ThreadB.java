package com.tpadsz.test;

import com.tpadsz.tools.Tools;

import java.util.Date;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadB extends Thread {
    public void run(){
        try {
            for (int i=0;i<20;i++){
                if (Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("B "+Tools.t1.get());
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
