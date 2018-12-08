package com.io.javabrains.unit3;

public class MethoReferenceExample2 {

    public static void main(String[] args) {
        // printMessage();
        Thread t = new Thread(() -> printMessage());
        t.start();
        Thread t1 = new Thread(MethoReferenceExample2::printMessage);
        // MethodReferenceExample2::printMessage
        // ===
        // () -> printMessage()
        t1.start();
    }

    public static void printMessage() {
        System.out.println("HELLO PRINT MESSAGE");
    }

}
