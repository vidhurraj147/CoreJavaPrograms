package com.rahulkadgekar.designpatterns.factoryanother;

public class Server implements Computer {

    private String RAM;
    private String HDD;
    private String CPU;

    public Server(String ram, String hdd, String cpu) {
        RAM = ram;
        HDD = hdd;
        CPU = cpu;
    }

    @Override
    public String getRAM() {
        // TODO Auto-generated method stub
        return RAM;
    }

    @Override
    public String getHDD() {
        // TODO Auto-generated method stub
        return HDD;
    }

    @Override
    public String getCPU() {
        // TODO Auto-generated method stub
        return CPU;
    }

    public String valuesfrom() {
        return "THIS IS A METHOD FROM SERVER";
    }

    @Override
    public String valuesFrom() {
        // TODO Auto-generated method stub
        return "ANOTHER METHOD FROM SERVER";
    }

    @Override
    public int Addition(int a, int b) {
        // TODO Auto-generated method stub
        System.out.println("FROM SERVER");
        return a + b;
    }

    @Override
    public int subs(int a, int b) {
        System.out.println("FROM SERVER");
        return a - b;
    }

    public void className() {
        System.out.println("server");
    }

}
