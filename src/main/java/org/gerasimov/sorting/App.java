package org.gerasimov.sorting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(ArraySorter.class.getName());

        ArraySorter arraySorter = new ArraySorter();

        try {
            String inputLoggerMessage = String.format("Input array: %s", arraySorter.convertArrayToString(args));
            logger.log(Level.INFO, inputLoggerMessage);
            String outputLoggerMessage = String.format("Sorted array: %s", arraySorter.sort(args));
            logger.log(Level.INFO,  outputLoggerMessage);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

    }


}
