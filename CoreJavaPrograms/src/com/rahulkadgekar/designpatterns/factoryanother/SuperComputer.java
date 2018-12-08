package com.rahulkadgekar.designpatterns.factoryanother;

public class SuperComputer implements Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public SuperComputer(String ram, String hdd, String cpu) {
        // TODO Auto-generated constructor stub
        RAM = ram;
        HDD = hdd;
        CPU = cpu;
    }

    @Override
    public String getRAM() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getHDD() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getCPU() {
        // TODO Auto-generated method stub
        return null;
    }

    public String valuesfrom() {
        return "THIS IS A METHOD FROM SUPERCOMPUTER";
    }

    @Override
    public String valuesFrom() {
        // TODO Auto-generated method stub
        return "ANOTHER METHOD FROM SUPERCOMPUTER";
    }

    @Override
    public int Addition(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int subs(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void className() {
        // TODO Auto-generated method stub
        System.out.println("THIS IS SuperComputer class");

    }

}
