package com.tpadsz.tools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class ThreadA extends Thread {

    public void run(){
       try {
           for (int i=0;i<10;i++){
               System.out.println("在ThreadA线程中取值= "+MyTools.t1.get());
               Thread.sleep(1000);
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {

        try {
            for (int i=0;i<10;i++){
                System.out.println("在Main线程中取值= "+MyTools.t1.get());
                Thread.sleep(1000);
            }
            Thread.sleep(5000);
            ThreadA a =new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
