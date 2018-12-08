package com.tutorialspoint;

public class Java8TesterDefaultMethod {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }

}

interface Vehicle {
    default void print() {
        System.out.println("I AM VEHICLE -- interface Vehicle");
    }

    static void blowHorn() {
        System.out.println("BLOWING HORN -- interface Vehicle");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("I AM A FOURWHEELER -- interface FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("THIS IS CAR -- class Car implements Vehicle, FourWheeler");
    }
}
