package com.rahulkadgekar.designpatterns.singleton;

public class LazyInitializedSingleTon {
    private static LazyInitializedSingleTon instance;

    private LazyInitializedSingleTon() {
    }

    public static LazyInitializedSingleTon getInstance(String name) {
        if (instance == null) {
            instance = new LazyInitializedSingleTon();
        }
        System.out.println(name + " name LazyInitializedSingleTon hashcode" + instance.hashCode());
        return instance;
    }

}
