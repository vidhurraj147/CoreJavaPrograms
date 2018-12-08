package com.tutorialspoint;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        // with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        // without type declaration
        MathOperation substraction = (a, b) -> a - b;

        // with RETURN statement along with curly braces
        MathOperation multiplication = (int a, int b) -> a * b;

        // WITHOUT RETURN statement and WITHOUT CURLY braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5=" + tester.operate(10, 5, addition));
        System.out.println("10-5=" + tester.operate(10, 5, substraction));
        System.out.println("10*5=" + tester.operate(10, 5, multiplication));
        System.out.println("10/5=" + tester.operate(10, 5, division));

        GreetingService gs1 = message -> System.out.println("Hello " + message);
        GreetingService gs2 = message -> System.out.println("Hello " + message);

        gs1.sayMessage("suresh");
        gs2.sayMessage("Rahul");

    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation operation) {
        return operation.operation(a, b);
    }

}
