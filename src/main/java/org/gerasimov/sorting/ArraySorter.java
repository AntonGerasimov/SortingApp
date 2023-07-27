package org.gerasimov.sorting;

import java.util.Arrays;
import java.util.logging.Logger;



public class ArraySorter {

    private final Logger LOGGER = Logger.getLogger(ArraySorter.class.getName());

    public String sort(String[] args){

        if ( (args.length == 0) || (args == null) ){
            throw new IllegalArgumentException("Arguments are missing");
        }

        if (args.length > 10){
            throw new IllegalArgumentException("Too much arguments. Try to enter less then 11 arguments");
        }
        int[] integerArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            integerArray[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(integerArray);

        return convertToString(integerArray);
    }


    private String convertToString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i] + " ");
        }
        return stringBuilder.toString().trim();
    }
}