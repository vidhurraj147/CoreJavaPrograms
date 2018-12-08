package com.rahulkadgekar.designpatterns.factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB", "2.4GHZ");
        Computer server = ComputerFactory.getComputer("server", "22GB", "2500GB", "22.4GHZ");

        System.out.println("Factory PC config : " + pc);
        System.out.println("Factory SERVER config :: " + server);
    }

}
