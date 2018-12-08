package com.rahulkadgekar.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(String name) {
        System.out.println(name + " name BillPughSingleton hashcode" + SingletonHelper.INSTANCE.hashCode());
        return SingletonHelper.INSTANCE;
    }

}
