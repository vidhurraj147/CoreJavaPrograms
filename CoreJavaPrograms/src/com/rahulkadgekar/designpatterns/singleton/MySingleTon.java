package com.rahulkadgekar.designpatterns.singleton;

public class MySingleTon {

    private static MySingleTon myObj;

    public static MySingleTon getInstance() {
        if (myObj == null) {
            myObj = new MySingleTon();
        }
        return myObj;
    }

    public void getSomeString() {
        System.out.println(myObj.getClass().getName() + "<-- name THIS IS FROM MySingleTon class hashcode --> " +
                myObj.hashCode());
    }

}
