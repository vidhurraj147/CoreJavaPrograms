package com.tutorialspoint;

//Lambda expression facilitates functional programming and simplifies the development a lot

// A lambda expression is
// parameter -> expression body
//Optional type declaration
//Optional parenthesis around parameter
//Optional curly braces
//Optinal return statement

public class LambdaExpressions {

    public static void main(String[] args) {
        LambdaExpressions tester = new LambdaExpressions();
        MathOperation add = (int a, int b) -> a + b;
        MathOperation subs = (a, b) -> a - b;
        MathOperation mul = (int a, int b) -> {
            return a * b;
        };
        MathOperation div = (int a, int b) -> a / b;
        System.out.println("10 + 5 = " + tester.operate(10, 5, add));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subs));
        System.out.println("10 * 5 = " + tester.operate(10, 5, mul));
        System.out.println("10 / 5 = " + tester.operate(10, 5, div));

        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}