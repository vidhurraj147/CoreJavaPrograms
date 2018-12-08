package com.tutorialspoint.java8;

import java.util.Arrays;
import java.util.List;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation substraction = (a, b) -> a - b;
        MathOperation division = (int a, int b) -> a / b;
        MathOperation multiplication = (int a, int b) -> a * b;

        System.out.println("1addition " + addition.operation(10, 5));
        System.out.println("2substraction " + tester.operate(10, 5, substraction));
        System.out.println("3division " + tester.operate(10, 5, multiplication));
        System.out.println("4multiplication " + multiplication.operation(10, 5));
        System.out.println("5division " + tester.operate(10, 5, division));
        System.out.println("6division " + division.operation(30, 5));

        HelloGreeting hg = (message) -> System.out.println("Hello WAS " + message);
        hg.greet("THIS IS PARAMETER");

        HelloGreeting hg1 = kk -> System.out.println("This is message 2 " + kk);
        hg1.greet("THIS IS KK VALUE ");

        List<Employee> employees = Arrays.asList(
                new Employee("fdsfds", "asdasd", 30),
                new Employee("Rahul", "Kadgekar", 31),
                new Employee("Podisha", "Raghunath", 36),
                new Employee("one one", "this this", 45));

        for (Employee e : employees) {
            System.out.println("This is employee details " + e.toString());
        }
        System.out.println("-----------------------------------------");

        employees.forEach(System.out::println);
        System.out.println("-----------------------------------------");
        employees.stream().filter(s -> s.getFirstName().contains("Ra")).forEach(System.out::println);

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    int operate(int a, int b, MathOperation operate) {
        return operate.operation(a, b);
    }

    interface HelloGreeting {
        void greet(String s);
    }

}
