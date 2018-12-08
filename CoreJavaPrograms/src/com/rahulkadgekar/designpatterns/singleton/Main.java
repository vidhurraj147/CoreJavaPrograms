package com.rahulkadgekar.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        divideLine();
        BillPughSingleton bps1 = BillPughSingleton.getInstance("bps1");
        BillPughSingleton bps2 = BillPughSingleton.getInstance("bps2");
        BillPughSingleton bps3 = BillPughSingleton.getInstance("bps3");
        divideLine();
        ThreadSafeSingletonDoubleCheckedLocking tssdcl1 = ThreadSafeSingletonDoubleCheckedLocking
                .getInstance("tssdcl1");
        ThreadSafeSingletonDoubleCheckedLocking tssdcl2 = ThreadSafeSingletonDoubleCheckedLocking
                .getInstance("tssdcl2");
        ThreadSafeSingletonDoubleCheckedLocking tssdcl3 = ThreadSafeSingletonDoubleCheckedLocking
                .getInstance("tssdcl3");
        divideLine();
        ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance("tss1");
        ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance("tss2");
        ThreadSafeSingleton tss3 = ThreadSafeSingleton.getInstance("tss3");
        divideLine();
        LazyInitializedSingleTon lis1 = LazyInitializedSingleTon.getInstance("lis1");
        LazyInitializedSingleTon lis2 = LazyInitializedSingleTon.getInstance("lis2");
        LazyInitializedSingleTon lis3 = LazyInitializedSingleTon.getInstance("lis3");
        divideLine();
        StaticBlockingSingleton sbs1 = StaticBlockingSingleton.getInstance();
        StaticBlockingSingleton sbs2 = StaticBlockingSingleton.getInstance();
        StaticBlockingSingleton sbs3 = StaticBlockingSingleton.getInstance();
        sbs1.StaticBlockingSingletonString("sbs1");
        sbs2.StaticBlockingSingletonString("sbs2");
        sbs3.StaticBlockingSingletonString("sbs3");
        divideLine();
        EagerInitializedSingleton ETS1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton ETS2 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton ETS3 = EagerInitializedSingleton.getInstance();
        ETS1.getSomeString();
        ETS2.getSomeString();
        ETS3.getSomeString();
        divideLine();
        MySingleTon mst1 = MySingleTon.getInstance();
        MySingleTon mst2 = MySingleTon.getInstance();
        MySingleTon mst3 = MySingleTon.getInstance();

        mst1.getSomeString();
        mst2.getSomeString();
        mst3.getSomeString();
        divideLine();
        SingletonGI x = SingletonGI.getInstance();
        SingletonGI y = SingletonGI.getInstance();
        SingletonGI z = SingletonGI.getInstance();

        System.out.println("String from x is " + x.s + " Hashcode " + x.hashCode());
        System.out.println("String from y is " + y.s + " Hashcode " + y.hashCode());
        System.out.println("String from z is " + z.s + " Hashcode " + z.hashCode());

        x.s = (x.s).toUpperCase();
        System.out.println("String from x is " + x.s + " Hashcode " + x.hashCode());
        System.out.println("String from y is " + y.s + " Hashcode " + y.hashCode());
        System.out.println("String from z is " + z.s + " Hashcode " + z.hashCode());

        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s + " Hashcode " + x.hashCode());
        System.out.println("String from y is " + y.s + " Hashcode " + y.hashCode());
        System.out.println("String from z is " + z.s + " Hashcode " + z.hashCode());
        divideLine();
    }

    public static void divideLine() {
        System.out.println(
                "============================================================================================");
    }

}
