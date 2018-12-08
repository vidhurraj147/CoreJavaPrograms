package com.io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.io.javabrains.Person;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("asdasd", "asdasd", 60),
                new Person("asdas", "dfgdgf", 45),
                new Person("asdasd", "gfdgdg", 77),
                new Person("dfgdfg", "ujkythe", 32),
                new Person("dfgd", "ethet", 23),
                new Person("ryjjyj", "jyyjyj", 45),
                new Person("veer", "", 44),
                new Person("tryry", "rtyrty", 6456),
                new Person("tetre", "sdvtnb", 65));

        // Step1 : sort list by LastName
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // Step2 : prints all elements in the list
        printConditionally(people, p -> true, p -> System.out.println(p));

        // Step3 : LastName with letter d
        // printLastNameBeginWithC(people);
        printConditionally(people, p -> p.getLastName().startsWith("d"), p -> System.out.println(p.getFirstName()));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                // System.out.println("p.getLastName().startsWith(d) -- " + p.toString());
                consumer.accept(p);

            }

        }
    }

    private static void printLastNameBeginWithC(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("d")) {
                System.out.println("p.getLastName().startsWith(d) -- " + p.toString());
            }

        }
    }

}
