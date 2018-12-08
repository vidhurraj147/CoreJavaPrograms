package com.io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import com.io.javabrains.Person;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("asdasd", "sdfsdfs", 40),
                new Person("gsfdsf", "gtthgth", 30),
                new Person("thdmitm", "fjjkifk", 45),
                new Person("hkkmkmdc", "kkkmdmd", 55),
                new Person("kkvmkfmvkf", "jkjfkmdlkfd", 76));

        System.out.println("Using for Loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));// External iterators
        }

        System.out.println("Using FOR EACH LOOP");
        for (Person p : people) {
            System.out.println(p); // External Iterators
        }

        // Internal Iterator
        System.out.println("forEach(consumer) -- Internal Iterator ");
        people.forEach((kkk) -> System.out.println(kkk));

        System.out.println("THIS IS METHOD REFERENCE -- System.out::println");
        people.forEach(System.out::println);
    }

}
