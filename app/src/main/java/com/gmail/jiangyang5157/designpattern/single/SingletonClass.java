package com.gmail.jiangyang5157.designpattern.single;

/**
 * @author Yang
 * @since 6/29/2016
 */
public class SingletonClass implements HasAge {
    private static volatile SingletonClass instance;

    private int age = 11;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }

        return instance;
    }

    @Override
    public int getAge() {
        return age;
    }
}
