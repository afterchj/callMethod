package com.tpadsz.thread;

import com.tpadsz.controller.LoginServlet;

/**
 * Created by hongjian.chen on 2018/2/23.
 */
public class BLogin extends Thread {
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
