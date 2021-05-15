package com.carycary.support;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.carycary
 * @date 2021/5/15 15:25
 */

public class Person {
    private String name;
    private int age;
    //alt +insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}