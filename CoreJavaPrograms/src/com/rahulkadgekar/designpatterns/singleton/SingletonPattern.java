package com.rahulkadgekar.designpatterns.singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println("This is Singleton Pattern");
        // Singleton pattern restricts the instantiation of a class
        // Ensures that only one instance of the class exists in the Java Virtual Machine
        // The Singleton class must provide a global access point to get the instance of the class
        // Singleton class is used for Logging, Driver objects, caching and thread pool
        // java.lang.Runtime java.awt.Desktop

        // Singleton implementation have different all approaches BUT all of them have following common concepts
        // Private constructor to restrict instantitation of the class from other class
        // Private static variable of the same class that is the only instance of the class
        //

    }

}
