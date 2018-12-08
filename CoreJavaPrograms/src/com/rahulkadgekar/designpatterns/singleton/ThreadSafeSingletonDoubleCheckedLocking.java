package com.rahulkadgekar.designpatterns.singleton;

public class ThreadSafeSingletonDoubleCheckedLocking {
    private static ThreadSafeSingletonDoubleCheckedLocking instance;

    private ThreadSafeSingletonDoubleCheckedLocking() {

    }

    public static ThreadSafeSingletonDoubleCheckedLocking getInstance(String name) {
        if (instance == null) {
            synchronized (ThreadSafeSingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonDoubleCheckedLocking();
                }
            }
        }
        System.out.println(name + " name ThreadSafeSingletonDoubleCheckedLocking hashcode" + instance.hashCode());
        return instance;
    }

}
