package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

public class Java8TesterForLoop {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("asdads");
        names.add("2asdads");
        names.add("3asdads");
        names.add("4asdads");
        names.add("5asdads");
        names.add("6asdads");
        names.add("7asdads");

        names.forEach(System.out::println);

    }

}
