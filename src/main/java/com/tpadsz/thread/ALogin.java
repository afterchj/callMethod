package com.tpadsz.thread;

import com.tpadsz.controller.LoginServlet;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class ALogin extends Thread {
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
