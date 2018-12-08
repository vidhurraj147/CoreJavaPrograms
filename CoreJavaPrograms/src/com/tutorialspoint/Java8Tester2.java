package com.tutorialspoint;

public class Java8Tester2 {

    final static String saluation = "Hello Saluation ";

    public static void main(String[] args) {
        GreetingService gs1 = (message) -> System.out.println("THIS IS MESSAGE --- " + saluation + message);
        GreetingService gs2 = (saluation) -> System.out.println("THIS IS MESSAGE --- " + saluation);
        gs1.sayMessage("RAHUL");
        gs2.sayMessage("JUST_saluation");
    }

}
