package com.rahulkadgekar.designpatterns.singleton;

public class SingletonGI {
    private static SingletonGI single_instance = null;

    public String s;

    private SingletonGI() {
        s = "Hello Iam string part of Singleton class";
    }

    public static SingletonGI getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonGI();
        }
        return single_instance;
    }

}
