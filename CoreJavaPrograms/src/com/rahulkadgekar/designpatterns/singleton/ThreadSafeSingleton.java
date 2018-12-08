package com.rahulkadgekar.designpatterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance(String name) {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        System.out.println(name + " name ThreadSafeSingleton hashcode" + instance.hashCode());
        return instance;
    }

}
