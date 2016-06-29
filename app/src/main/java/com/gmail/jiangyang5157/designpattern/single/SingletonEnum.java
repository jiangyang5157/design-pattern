package com.gmail.jiangyang5157.designpattern.single;

public enum SingletonEnum implements HasAge {
    INSTANCE("test") {
        private int age = 11;

        @Override
        public int getAge() {
            return age;
        }
    };

    SingletonEnum(String value) {
        System.out.println("value");
    }

    public static SingletonEnum getInstance() {
        return SingletonEnum.INSTANCE;
    }
}
