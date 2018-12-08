package com.rahulkadgekar.designpatterns.singleton;

public class EagerInitializedSingleton {
    public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void getSomeString() {
        System.out.println(instance.getClass().getName() + "<-- name EagerInitializedSingleton hashcode --> " +
                instance.hashCode());
    }

}
