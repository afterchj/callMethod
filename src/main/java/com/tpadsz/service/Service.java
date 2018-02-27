package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString=new String();
        while (isContinueRun == true) {
            synchronized (anyString){
            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
