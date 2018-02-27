package com.tpadsz.tools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class Run {
    public static ThreadLocalExt ext=new ThreadLocalExt();

    public static void main(String[] args) {
        if (ext.get()==null){
            System.out.println("从未放过值");
            ext.set("第一次放值");
        }
        System.out.println(ext.get());
        System.out.println(ext.get());
    }
}
