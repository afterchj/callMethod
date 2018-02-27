package com.tpadsz.service;


/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class ServiceThreadB extends Thread {
    private Service service;

    public ServiceThreadB(Service service) {
        super();
        this.service = service;
    }

    public void run() {
        service.stopMethod();
    }
}
