package com.tpadsz.test;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyObject {
    private String username = "b";
    private String password = "bb";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printString() {
        System.out.println(username + " " + password);
    }

    public static void main(String[] args) throws InterruptedException {
        final MyObject object = new MyObject();
        Thread thread1 = new Thread("a") {
            public void run() {
                object.setValue("a", "aa");
            }
        };
        thread1.start();
        Thread.sleep(500);

        Thread thread2 = new Thread(() ->
                object.printString()
        );
        thread2.start();
    }
}
