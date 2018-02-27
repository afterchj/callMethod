package com.tpadsz.singleton;

import java.io.Serializable;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyObj implements Serializable{

    private static final long serialVersionUID=1L;
    //内部类方式实现单例模式
    private static class MyObjHandel {
        private static MyObj obj = new MyObj();
    }

    private MyObj() {
    }

    public static MyObj getInstance() {
        return MyObjHandel.obj;
    }

    protected static Object readResolve(){
        System.out.println("调用了readResolve方法！");
        return MyObjHandel.obj;
    }
}
