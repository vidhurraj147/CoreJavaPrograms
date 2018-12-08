package com.io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.io.javabrains.Person;

public class StreamsExample {
    public static void main(String[] args) {
        boolean ver1_8 = (Double.parseDouble(System.getProperty("java.version").substring(0, 3)) > 1.7) ? true : false;

        if (ver1_8) {
            System.out.println("Java version is 1.8" + ver1_8);
        }
        else {
            System.out.println("java version LESS THAN 1.8 " + ver1_8);
        }
        List<Person> people = Arrays.asList(
                new Person("1David", "1Dania", 19),
                new Person("2David", "2Dania", 21),
                new Person("3David", "3Dania", 23),
                new Person("4David", "5Dania", 25),
                new Person("5David", "6Dania", 27),
                new Person("6David", "4Dania", 29),
                new Person("7David", "7Dania", 20),
                new Person("8David", "9Dania", 20),
                new Person("9David", "44Dania", 20));

        if (ver1_8) {
            // DO JAVA 1.8 STUFF
            people.stream().forEach(p -> System.out.println(p.getLastName()));

            people.stream().filter(p -> p.getLastName().startsWith("3"))
                    .forEach(p -> System.out.println(p));

            people.stream().filter(p -> true)
                    .forEach(p -> printThis(p));

            Stream<Person> stream = people.stream();
            long count = stream.filter(p -> p.getAge() >= 20).count();
            System.out.println("count " + count);

            doAllThingsForStream(people.stream());

        }
        else {
            // else DO JAVA 1.7 STUFF
        }

    }

    private static void doAllThingsForStream(Stream<Person> stream) {
        // printThis(stream.filter(Perso));

    }

    private static void printThis(Person p) {
        System.out.println(p);
    }

}
