package org.gerasimov.sorting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(ArraySorter.class.getName());

        ArraySorter arraySorter = new ArraySorter();

        try {
            logger.log(Level.INFO, "Input array: {}", arraySorter.convertArrayToString(args));
            logger.log(Level.INFO, "Sorted array: {}", arraySorter.sort(args));

        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

    }


}
