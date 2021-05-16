package com.carycary;

import com.carycary.support.Person;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary
 * @date 2021/5/15 15:57
 */
public class ClauseDebugDemo {

    //给断点设置条件表达式,比如在循环体当中
    public static void clause() {
        for (int i = 0; i < 100; i++) {
            System.out.println("in the loop");
            if (i == 50) {
                System.out.println("shit is happens!");
            } else {
                System.out.println("all complete");
            }
        }
    }

    //观察变量变化
    public static void watchVar() {
        Person p = new Person("张三", 15);
        p.setAge(16);
        System.out.println(p);
    }

    public static void back() {
        Person person1 = new Person("后悔药", 18);
        System.out.println(person1);

    }

    public static void setValue() {
        Person change = new Person("change", 20);
        if (change.getAge() <= 19) {
            System.out.println("感觉变年轻了");
        } else {
            System.out.println("岁月是杀猪刀");
        }
    }


    public static void reloadChanges(){
        Person p = new Person("change", 20);
        System.out.println(p);
    }

    public static void main(String[] args) {
        // back();
        // setValue();
        // clause();
        // watchVar();
        reloadChanges();
    }


}