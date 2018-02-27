package com.tpadsz.tools;

import java.util.Date;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class InheritableThreadLocalExt  extends InheritableThreadLocal{

    public Object initialValue(){
        return new Date().getTime();
    }

    protected Object childValue(Object parentValue){
        return parentValue+"子线程添加的值~！";
    }
}
