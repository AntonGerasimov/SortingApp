package org.gerasimov.sorting;

import java.util.Arrays;


public class ArraySorter {


    public String sort(String... args) {

        validate(args);

        int[] integerArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            integerArray[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(integerArray);

        return convertToString(integerArray);
    }

    private void validate(String[] args) {
        if (args == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        if (args.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        if (args.length > 10) {
            throw new IllegalArgumentException("Too much arguments. Try to enter less then 11 arguments");
        }

        for (String arg : args
        ) {
            try {
                int testInt = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Input array contains invalid elements. All elements should be whole numbers");
            }

        }

    }


    private String convertToString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i] + " ");
        }
        return stringBuilder.toString().trim();
    }
}