package com.tpadsz.condition;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA[] a=new ThreadA[10];
        ThreadB[] b=new ThreadB[10];
        for (int i=0;i<10;i++){
            a[i]=new ThreadA(service);
            b[i]=new ThreadB(service);
            a[i].start();
            b[i].start();
        }
    }
}
