package com.io.javabrains;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println(" PRINTED IN Runnable run()");
                
            }
        });
        myThread.run();
        
        Thread myThread2 = new Thread(() -> System.out.println("myThread2 SIMPLE INLINE LAMBDA"));
        myThread2.run();
    }

}
