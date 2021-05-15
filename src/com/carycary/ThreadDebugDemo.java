package com.carycary;

import com.carycary.support.MyThread;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary.support
 * @date 2021/5/15 15:47
 */
public class ThreadDebugDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "线程1");
        Thread thread2 = new Thread(myThread, "线程2");
        Thread thread3 = new Thread(myThread, "线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}