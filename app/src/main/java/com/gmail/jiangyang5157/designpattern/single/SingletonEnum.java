package com.gmail.jiangyang5157.designpattern.single;

public enum SingletonEnum implements HasAge {
    INSTANCE {
        private int age = 11;

        @Override
        public int getAge() {
            return age;
        }
    };

    public static SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
