package com.rahulkadgekar.designpatterns.factoryanother.implementation;

import com.rahulkadgekar.designpatterns.factoryanother.Computer;
import com.rahulkadgekar.designpatterns.factoryanother.PC;
import com.rahulkadgekar.designpatterns.factoryanother.Server;
import com.rahulkadgekar.designpatterns.factoryanother.SuperComputer;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
        Computer comp = null;
        switch (type) {
            case PC:
                comp = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                comp = new Server(ram, hdd, cpu);
                break;
            case SUPERCOMPUTER:
                comp = new SuperComputer(ram, hdd, cpu);
        }

        return comp;
    }

}
