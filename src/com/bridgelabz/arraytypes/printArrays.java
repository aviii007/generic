package com.bridgelabz.arraytypes;

public class printArrays {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'A', 'S', 'H', 'V', 'I', 'N', 'I'};

        System.out.println("The Array of integerArray has:");
        printArray(integerArray);

        System.out.println("The Array of doubleArray has:");
        printArray(doubleArray);

        System.out.println("The Array of characterArray has:");
        printArray(characterArray);
    }
}

