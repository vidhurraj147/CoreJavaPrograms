package com.rahulkadgekar.designpatterns.singleton;

public class StaticBlockingSingleton {
    private static StaticBlockingSingleton instance;

    // Static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockingSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating Singleton instance");
        }
    }

    public static StaticBlockingSingleton getInstance() {
        return instance;
    }

    public void StaticBlockingSingletonString(String name) {
        System.out.println(name + "<-- name StaticBlockingSingletonString hashcode --> " +
                instance.hashCode());
    }

}
