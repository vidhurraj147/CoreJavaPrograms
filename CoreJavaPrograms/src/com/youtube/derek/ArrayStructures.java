package com.youtube.derek;

public class ArrayStructures {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("--------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("array[" + i + "]-" + theArray[i]);
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        }
        return 0;
    }

    public boolean doesArrayContainsThisValue(int searchValue) {
        boolean returnValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    public void deleteIndex(int index) {
        if (arraySize > index) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
        else {
            System.out.println("INDEX DOESNT EXIST");
        }
    }

    public void insertValue(int value) {
        if (theArray.length > arraySize) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        String valuesFound = "";
        boolean foundValues = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valuesFound += i + ",";
                foundValues = true;
            }
        }
        if (!foundValues) {
            valuesFound = value + "- NONE FOUND";
        }
        else {
            valuesFound = value + "- " + valuesFound;
        }

        return valuesFound;
    }

    public void bubbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j + 1]) {
                    swapValues(j, j + 1);
                    // printHozArray(i, j);
                    // printHozArray();
                }
                // printHozArray();
            }
            System.out.println("The Index IS " + (arraySize - (i + 1)));
        }
        printHozArray();
    }

    private void swapValues(int one, int two) {
        int temp = theArray[one];
        theArray[one] = theArray[two];
        theArray[two] = temp;

    }

    private void printHozArray() {
        String dashes = "";
        String index = "";
        String valueInIndex = "";
        for (int i = 0; i < arraySize; i++) {
            index += "| " + i + "  ";
            valueInIndex += "| " + theArray[i] + " ";
        }

        for (int i = 0; i < valueInIndex.length(); i++) {
            dashes += "-";
        }
        System.out.println(dashes);
        System.out.println(index);
        System.out.println(dashes);
        System.out.println(valueInIndex);
        System.out.println(dashes);

    }

    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        newArray.printHozArray();
        newArray.bubbleSort();
        // System.out.println(newArray.getValueAtIndex(6));
        // newArray.insertValue(333);
        // newArray.printArray();
        // System.out.println(newArray.doesArrayContainsThisValue(17));
        // newArray.deleteIndex(3);
        // newArray.printArray();
        // newArray.insertValue(30);
        // System.out.println("Indexes for " + newArray.linearSearchForValue(17));
        // System.out.println("Indexes for " + newArray.linearSearchForValue(12));
    }

}
