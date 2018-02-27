package com.tpadsz.mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class MyList {
    public static List list = new ArrayList();
//    volatile private int size;

    public static void add() {
        list.add("test");
    }

    public static int size() {
//        size = list.size();
        return list.size();
    }
}
