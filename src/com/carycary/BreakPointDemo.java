package com.carycary;

import com.carycary.support.IService;
import com.carycary.support.IServiceImpl;
import com.carycary.support.Person;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary
 * @date 2021/5/15 15:11
 */
public class BreakPointDemo {

    //行段点 红色圆形
    public static void line() {
        System.out.println("this is from line");
    }

    //可直接详细设置的断点方式shift+mouseleft 黄色圆形
    public static void detailLine() {
        System.out.println("this is from detailLine");
    }

    //方法断点|接口会直接跳转至具体实现类  方法断点为菱形调试后也会运行到方法尾部
    // 如果某个接口有多个实现类,还可以通过给接口方法打断点的方式运行程序可以找到程序具体使用的实现类
    public static void method() {
        System.out.println("this is from method");
        IService iService = new IServiceImpl();
        iService.execute();
    }

    //异常断点 |我这里有一个空指针异常,程序也跑出来了,然后我通过异常断点,可以快速定位到该异常产生的代码位置
    public static void exception() {
        Object o = null;
        o.toString();
        //这行永远无法到达捕获异常
        System.out.println("this line can never be the reached catch the exception");
    }

    //想要追踪某个字段的变化流程,可以在实体类当中给字段打上断点,然后逐步追踪字段的每个变化,
    // 右键断点设置也可以设置不光是修改,访问字段也会停顿
    public static void field() {
        Person p = new Person("字段断点", 10);
        p.setAge(12);
        System.out.println(p);
        System.out.println(p.getAge());
    }

    public static void main(String[] args) {
        // line();
        // detailLine();
        // method();
        // exception();
        field();
    }
}