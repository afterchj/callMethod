package com.tpadsz.service;


/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class ServiceThreadA extends Thread {
    private Service service;

    public ServiceThreadA(Service service) {
        super();
        this.service = service;
    }

    public void run() {
        service.runMethod();
    }
}
