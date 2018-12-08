package com.io.javabrains.unit2;

import com.io.javabrains.unit2.ClosuresExample.Process;

public class ThisReferenceExample {

    public void doProcess(int i, com.io.javabrains.unit2.ClosuresExample.Process p) {
        p.process(i);
    }

    public void executed() {
        doProcess(10, i -> {
            System.out.println("Value of i " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample trx = new ThisReferenceExample();
        trx.executed();

        trx.doProcess(10, i -> {
            System.out.println("Value of I is " + i);
            // System.out.println(this);
        });

        int i = 10;
        trx.doProcess(i, (p) -> System.out.println("Value of I is " + i));
        trx.doProcess(10, new Process() {

            @Override
            public void process(int i) {
                System.out.println("Value of I is " + i);
                System.out.println(this);
            }

        });
    }

    @Override
    public String toString() {
        return " THIS IS THE MAIN THISREFERENCE EXAMPLE";
    }

}

// @Override
// public String toString() {
// return "This is the anonymous inner class";
// }