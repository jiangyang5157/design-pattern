package com.gmail.jiangyang5157.designpattern.single;

import android.content.Context;

/**
 * @author Yang
 * @since 6/29/2016
 */
public class SingletonClass implements HasAge {
    private static SingletonClass instance;

    private Context context;
    private int age = 11;

    private SingletonClass(Context context) {
        this.context = context;
    }

    public static synchronized SingletonClass getInstance(Context context) {
        if (instance == null) {
            instance = new SingletonClass(context);
        }
        return instance;
    }

    @Override
    public int getAge() {
        return age;
    }
}
