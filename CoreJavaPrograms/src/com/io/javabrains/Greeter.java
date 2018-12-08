package com.io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        // System.out.println("Hello World");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting hwg = new HelloWorldGreeting();
        greeter.greet(hwg);

        MyLambda myLambdaFunction = () -> System.out.println("HelloWorld myLambdaFunction");
        Greeting greeting = () -> System.out.println(" Hello World Greeting Interface");
        MyAdd addFunction = (int a, int b) -> a + b;

        myLambdaFunction.foofoo();
        greeting.perform();
        System.out.println("addFunction.addFun(10, 50);" + addFunction.addFun(10, 50));
        System.out.println("myLambdaFunction myLambdaFunction " + myLambdaFunction);
        System.out.println("addFunction addFunction" + addFunction);

        Greeting innerClassGreeting = () -> System.out.println("PRINT annonymys inner class innerClassGreeting ");
        innerClassGreeting.perform();
    }

}

interface MyLambda {
    void foofoo();
}

interface MyAdd {
    int addFun(int a, int b);
}
// aBlockCode = () -> System.out.println("LAMBDA EXPRESSIONS");
// doubleTheNumberFunction = public int double(int a){
// return a*2;
// }
//
// doubleTheNumberFunction = int double(int a){
// return a*2;
// }
//
// doubleTheNumberFunction = public int (int a){
// return a*2;
// }
//
// doubleTheNumberFunction = (int a){
// return a*2;
// }
//
// doubleTheNumberFunction = (int a) -> {
// return a*2;
// };
//
// doubleTheNumberFunction = (int a) -> {return a*2;};
// doubleTheNumberFunction = (int a) -> a*2;
// doubleTheNumberFunction = (int a) -> (a*2);

// sumOfTheTwoNumbers = (int a,int b) -> a+b;
