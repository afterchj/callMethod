package com.tpadsz.singleton;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class LazyObject {
    private static LazyObject lazyObject;

    private LazyObject() {
    }

    /**
     * 同步方法解决-延迟加载/"懒汉模式"
     * synchronized public static LazyObject getInstance() {
     * try {
     * if (lazyObject != null) {
     * } else {
     * Thread.sleep(3000);
     * lazyObject = new LazyObject();
     * }
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * return lazyObject;
     * }
     */

    /**
     * 同步代码块解决-延迟加载/"懒汉模式"-初级版
     public static LazyObject getInstance() {
     try {
     synchronized (LazyObject.class) {
     if (lazyObject != null) {
     } else {
     Thread.sleep(3000);
     lazyObject = new LazyObject();
     }
     }
     } catch (InterruptedException e) {
     e.printStackTrace();
     }
     return lazyObject;
     }
     */
    /**
     * 同步代码块解决-延迟加载/"懒汉模式"-升级版
     * public static LazyObject getInstance() {
     * try {
     * if (lazyObject != null) {
     * } else {
     * Thread.sleep(3000);
     * synchronized (LazyObject.class) {
     * lazyObject = new LazyObject();
     * }
     * }
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * return lazyObject;
     * }
     */
    //使用DCL双检查锁机制
    //同步代码块解决-延迟加载/"懒汉模式"-终极版
    public static LazyObject getInstance() {
        try {
            if (lazyObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (LazyObject.class) {
                    if (lazyObject == null) {
                        lazyObject = new LazyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return lazyObject;
    }
}
