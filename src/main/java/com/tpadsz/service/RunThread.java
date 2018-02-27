package com.tpadsz.service;



/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class RunThread extends Thread {
    private MyService service;
    public RunThread(MyService service){
        super();
        this.service=service;
    }
    public void run(){
        service.addNum();
    }

    public static void main(String[] args) {
        try {
            MyService service=new MyService();
            RunThread[] array=new RunThread[5];
            for (int i=0;i<array.length;i++){
                array[i]=new RunThread(service);
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
