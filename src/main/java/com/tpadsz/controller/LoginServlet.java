package com.tpadsz.controller;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class LoginServlet {
    private static String userameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            userameRef = username;
            if (username.equals("a")) {
                Thread.sleep(3000);
            }
            passwordRef = password;
            System.out.println("username=" + userameRef + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
