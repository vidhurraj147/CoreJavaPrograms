package com.tutorialspoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8TesterStream {

    public static void main(String[] args) {
        System.out.println("USING JAVA 7: ");
        List<String> strings = Arrays.asList("asd", "sdfsd", "", "sdfsdf", "", "", "asd", "", "", "sfdsdf", "",
                "sfdgsd", "", "abc");
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("getCountEmptyStringUsingJava7 == " + count);
        System.out.println("USING JAVA 8: ");
        System.out.println("LIST OF STRINGS " + strings);
        count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("using strings.stream().filter(string -> string.isEmpty()).count() in JAVA 8 == " + count);

        System.out.println("Strings of LENGTH3 JAVA7");
        count = getCountofStringswithLength3(strings);
        System.out.println("getCountofStringswithLength3() Java7 == " + count);
        count = strings.stream().filter(kk -> kk.length() == 3).count();
        System.out.println("strings.stream().filter(string->string.length==3).count() " + count);

        System.out.println("Eliminated Empty String Java7");
        List filteredList = getEliminatedEmptyString(strings);
        System.out.println("getEliminatedEmptyString filteredList " + filteredList);
        System.out.println("Eliminated Empty String Java8");
        filteredList = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(
                "getEliminatedEmptyString filteredList strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList())" +
                        filteredList);

        // Eliminate empty string and join using comma.
        System.out.println("//Eliminate empty string and join using comma.");
        String mergedString = getEmliminateEmptyStringJoingUsingComma(strings);
        System.out.println("mergedString " + mergedString);
        mergedString = getEmliminateEmptyStringJoingUsingCommaSeperatorPassed(strings, ",");
        System.out.println("mergedString " + mergedString);

        System.out.println("USING Java8");
        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("mergedString " + mergedString);

        // Get a list of square of distinct numbers
        List<Integer> lists = Arrays.asList(2, 5, 98, 7, 8, 6, 2, 5, 99, 5, 5, 6, 8);
        System.out.println(" squareList -- " + lists);
        List<Integer> squaredList = getSquaredList(lists);
        System.out.println(" MATHpow 2 squaredList -- " + squaredList);
        squaredList = getSquaredList(lists, 3);
        System.out.println(" MATHpow 2 squaredList -- " + squaredList);
        System.out.println("JAVA8_Streams");
        squaredList = lists.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(" lists.stream().map(i->i*i).collect(Collectors.toList()) -- " + squaredList);

        System.out.println("Get list of integers " + lists);
        System.out.println("GETMAX " + getMax(lists));
        System.out.println("GETMIN " + getMin(lists));
        System.out.println("GETSUM " + getSum(lists));
        System.out.println("getAvg " + getAvg(lists));
        System.out.println("All Random list");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("random.nextInt() " + random.nextInt());
        }
        System.out.println("");

        IntSummaryStatistics stats = lists.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("IntSummaryStatistics stats = lists.stream().mapToInt((x) -> x).summaryStatistics()");
        System.out.println("GETMAX " + stats.getMax());
        System.out.println("GETMIN " + stats.getMin());
        System.out.println("GETSUM " + stats.getSum());
        System.out.println("getAvg " + Math.floor(stats.getAverage()));
        System.out.println("GETCOUNT " + stats.getCount());

        random.ints().limit(10).sorted().forEach(System.out::println);

        // parrallelStream
        count = strings.parallelStream().filter(string -> !string.isEmpty()).count();
        System.out.println("strings.parrallelStream.filter(string -> !string.isEmpty()).count()" + count);
    }

    private static int getMax(List<Integer> lists) {
        int maxNum = lists.get(0);
        for (int list : lists) {
            if (maxNum < list) {
                maxNum = list;
            }
        }
        return maxNum;
    }

    private static int getMin(List<Integer> lists) {
        int minNum = lists.get(0);
        for (int list : lists) {
            if (minNum > list) {
                minNum = list;
            }
        }
        return minNum;
    }

    private static int getSum(List<Integer> lists) {
        int totSum = 0;
        for (int list : lists) {
            totSum = totSum + list;
        }
        return totSum;
    }

    private static int getAvg(List<Integer> lists) {
        return getSum(lists) / lists.size();
    }

    private static List<Integer> getSquaredList(List<Integer> squareList, int powTo) {
        List<Integer> squaredList = new ArrayList<>();
        for (int sl : squareList) {
            squaredList.add((int) Math.pow(sl, powTo));
        }
        return squaredList;
    }

    private static List<Integer> getSquaredList(List<Integer> squareList) {
        return getSquaredList(squareList, 2);
        // List<Integer> squaredList = new ArrayList<>();
        // for (int sl : squareList) {
        // squaredList.add((int) Math.pow(sl, 2));
        // }
        // return squaredList;
    }

    private static String getEmliminateEmptyStringJoingUsingCommaSeperatorPassed(List<String> strings,
            String seperator) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            if (!string.isEmpty()) {
                sb.append(string);
                sb.append(seperator);
            }
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    private static String getEmliminateEmptyStringJoingUsingComma(List<String> strings) {
        String mergedString = "";
        for (String string : strings) {
            if (!string.isEmpty()) {
                mergedString += string + ",";
            }
        }
        return mergedString.substring(0, mergedString.length() - 1);
    }

    private static List getEliminatedEmptyString(List<String> strings) {
        List filtered = new ArrayList<String>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                filtered.add(string);
            }
        }
        return filtered;
    }

    private static long getCountofStringswithLength3(List<String> strings) {
        int count = 0;
        for (String string : strings) {
            if (string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static long getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for (String string : strings) {
            if (string.isEmpty()) {
                count++;
            }
        }

        return count;
    }

}
