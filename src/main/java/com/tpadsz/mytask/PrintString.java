package com.tpadsz.mytask;


/**
 * Created by hongjian.chen on 2018/2/24.
 */
public class PrintString implements Runnable {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod thread is " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("停止打印！stopThread =" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
