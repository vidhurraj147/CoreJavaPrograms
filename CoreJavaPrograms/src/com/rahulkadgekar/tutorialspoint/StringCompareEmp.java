package com.rahulkadgekar.tutorialspoint;

public class StringCompareEmp {

    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));

        String strOrig = "Hello world, Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");

        if (lastIndex == -1) {
            System.out.println("Hello not found");
        }
        else {
            System.out.println("last occurence of hello " + lastIndex);
        }

        String str1 = "This is Java";
        System.out.println(removeCharAt(str1, 3));

        String str2 = "I LOVE YOU PODISHA";
        System.out.println("STR2 value " + str2);
        String reverse = new StringBuffer(str2).reverse().toString();
        System.out.println("REVERSE value " + reverse);

        String str3 = "I LOVE YOU PODISHA";
        char[] try1 = str3.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }

    }

    private static String removeCharAt(String str1, int pos) {
        // return str1.substring(0, pos);
        // return str1.substring(pos + 1);
        return str1.substring(0, pos) + str1.substring(pos + 1);
    }

}
