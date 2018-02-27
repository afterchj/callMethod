package com.tpadsz.condition;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class RunFair {

    public static void main(String[] args) {
        final MyService service = new MyService(true);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("+线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i=0;i<threads.length;i++){
            threads[i]=new Thread(runnable);
            threads[i].start();
        }
    }
}
