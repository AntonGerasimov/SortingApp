package org.gerasimov.sorting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        final Logger LOGGER = Logger.getLogger(ArraySorter.class.getName());

        ArraySorter arraySorter = new ArraySorter();

        try {
            System.out.println(arraySorter.sort(args));
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

    }
}
