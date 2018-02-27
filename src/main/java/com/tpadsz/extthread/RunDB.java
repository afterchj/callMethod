package com.tpadsz.extthread;

import com.tpadsz.service.DBTools;

/**
 * Created by hongjian.chen on 2018/2/26.
 */
public class RunDB {
    public static void main(String[] args) {
        DBTools tools=new DBTools();
        for (int i=0;i<20;i++){
            BackupA output=new BackupA(tools);
            output.start();
            BackupB input=new BackupB(tools);
            input.start();
        }
    }
}
