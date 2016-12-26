package com.tzy.commons;

import java.io.Serializable;

/**
 * Created by zhangpeng12 on 2016/12/26.
 */
public class Person implements Serializable{

    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
