package com.carycary.support;

import java.util.concurrent.TimeUnit;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary.support
 * @date 2021/5/15 15:48
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        //这里调试多线程,右键断点可以看到有个all和thread选项,选择thread可以多线程调试,每条线程都会停顿一次,不要设置为default,
        //不然会很大程度影响调试的性能
        System.out.println(currentThread.getName()+"-=====================起始");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(currentThread.getName()+"=========================离开");
        }
    }
}