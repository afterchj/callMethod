package com.tpadsz.singleton;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyObject {
    private static MyObject myObject=new MyObject();
    private MyObject(){}

    public static MyObject getInstance(){
        return myObject;
    }
}
