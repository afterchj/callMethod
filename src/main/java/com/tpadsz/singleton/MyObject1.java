package com.tpadsz.singleton;

/**
 * Created by hongjian.chen on 2018/2/27.
 * 使用静态代码块实现单例模式
 */
public class MyObject1 {

    private static MyObject1 instance=null;
    private MyObject1(){}
    static {
        instance=new MyObject1();
    }
    public static MyObject1 getInstance(){
        return instance;
    }
}
