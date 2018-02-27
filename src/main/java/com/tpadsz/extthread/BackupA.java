package com.tpadsz.extthread;

import com.tpadsz.service.DBTools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class BackupA extends Thread {
    private DBTools tools;

    public BackupA(DBTools tools){
        super();
        this.tools=tools;
    }
    public void run(){
        tools.backupA();
    }
}
