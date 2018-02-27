package com.tpadsz.singleton;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class TestThread extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(MyEnum.connectionFactory.getConnection().hashCode());
//            System.out.println(SingletonObject.getConnection().hashCode());
        }
    }

    public static void main(String[] args) {
        TestThread[] threads=new TestThread[3];
        for (int i=0;i<threads.length;i++){
            TestThread thread=new TestThread();
            threads[i]=thread;
            thread.start();
        }
    }
}
