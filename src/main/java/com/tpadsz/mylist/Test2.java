package com.tpadsz.mylist;

/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String str=new String();
            System.out.println("syn上面 ");
            synchronized (str){
                System.out.println("syn第一行");
                str.wait();
                System.out.println("wait下的代码！");
            }
            System.out.println("syn下的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
