package com.tpadsz.entity;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println(Thread.currentThread().getName() + " " + username + " " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void getValue() {
        System.out.println(Thread.currentThread().getName() + " " + username + " " + password);
    }
}
