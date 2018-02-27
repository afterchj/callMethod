package com.tpadsz.extthread;

import com.tpadsz.service.DBTools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class BackupB extends Thread {
    private DBTools tools;

    public BackupB(DBTools tools){
        super();
        this.tools=tools;
    }
    public void run(){
        tools.backupB();
    }
}
