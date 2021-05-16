package com.carycary;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary
 * @date 2021/5/16 17:54
 */
public class ReleaseResourceDemo {
    public static void main(String[] args) {
        //当我在shit happens上打上断点,然后在断点调试的时候停止,可以看到控制台依然执行了下面的输出语句
        //正确的方法应该是强制右键调试栈强制退出,然后会发现进入线程的exit的方法,就不会输出后面的语句了
        System.out.println("shit happens");
        System.out.println("找到了bug");
        System.out.println("db 操作");
        System.out.println("mq操作");
        System.out.println("redis 操作");
    }
}