package com.rahulkadgekar.designpatterns.factoryanother.implementation;

import com.rahulkadgekar.designpatterns.factoryanother.Computer;
import com.rahulkadgekar.designpatterns.factoryanother.PC;
import com.rahulkadgekar.designpatterns.factoryanother.Server;
import com.rahulkadgekar.designpatterns.factoryanother.SuperComputer;

public class ComputerTest {

    public static void main(String args[]) {
        Computer pc = ComputerFactory.createComputer(ComputerType.PC, "20GB", "200GB", "20GHZ");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "120GB", "1200GB", "120GHZ");
        Computer sp = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "120GB", "1200GB", "120GHZ");
        System.out.println("PC is " + ((PC) pc).valuesfrom());
        System.out.println("Server is " + ((Server) server).valuesfrom());
        System.out.println("SuperComputer is" + ((SuperComputer) sp).valuesfrom());
        System.out.println("==============================");
        System.out.println(pc.valuesFrom());
        System.out.println(server.valuesFrom());
        System.out.println(sp.valuesFrom());
        System.out.println(pc.Addition(20, 40));
    }

}
