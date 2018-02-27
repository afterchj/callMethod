package com.tpadsz.tools;

import java.util.Date;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadLocalExt extends ThreadLocal {

    public Object initialValue(){
        return new Date().getTime();
//        return "默认值，第一次get不再为null";
    }
}
