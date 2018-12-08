package com.io.javabrains.unit3;

public class MethoReferenceExample1 {

    public static void main(String[] args) {
        // printMessage();
        Thread t = new Thread(() -> printMessage());
        t.start();
        Thread t1 = new Thread(MethoReferenceExample1::printMessage);
        t1.start();
    }

    public static void printMessage() {
        System.out.println("HELLO PRINT MESSAGE");
    }

}
