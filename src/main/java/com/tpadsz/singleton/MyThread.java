package com.tpadsz.singleton;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class MyThread extends Thread{
    public void run(){
        //饿汉模式
//       System.out.println(MyObject.getInstance().hashCode());
        //懒汉模式
//        System.out.println(LazyObject.getInstance().hashCode());
        //静态内部类
//        System.out.println(MyObj.getInstance().hashCode());
        //静态代码块
        for (int i=0;i<5;i++){
            System.out.println(MyObject1.getInstance().hashCode());
        }
    }


    public static void main(String[] args) {
       test1();
    }
    public static void test1(){
        MyThread[] threads=new MyThread[3];
        for (int i=0;i<threads.length;i++){
            MyThread thread=new MyThread();
            threads[i]=thread;
            thread.start();
        }
    }
//    public static void test2(){
//        MyThread[] threads=new MyThread[3];
//        for (int i=0;i<threads.length;i++){
//            MyThread thread=new MyThread();
//            threads[i]=thread;
//            thread.start();
//        }
//    }
}
