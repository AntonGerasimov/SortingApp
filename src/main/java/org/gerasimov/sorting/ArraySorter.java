package org.gerasimov.sorting;

import java.util.Arrays;


public class ArraySorter {


    public String sort(String... args) {

        validate(args);

        Integer[] integerArray = new Integer[args.length];

        for (int i = 0; i < args.length; i++) {
            integerArray[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(integerArray);

        return convertArrayToString(integerArray);
    }

    public String convertArrayToString(Object[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object element : array
        ) {
            stringBuilder.append(element.toString() + " ");
        }
        return stringBuilder.toString().trim();
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
                int wholeNumber = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Input array contains invalid elements. All elements should be whole numbers");
            }

        }

    }

}