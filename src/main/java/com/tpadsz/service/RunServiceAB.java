package com.tpadsz.service;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class RunServiceAB {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            ServiceThreadA a=new ServiceThreadA(service);
            a.start();
            Thread.sleep(1000);
            ServiceThreadB b=new ServiceThreadB(service);
            b.start();
            System.out.println("已发出停止命令了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
