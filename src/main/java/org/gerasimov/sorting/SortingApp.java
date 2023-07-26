package org.gerasimov.sorting;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SortingApp {

    private static final Logger LOGGER = Logger.getLogger(SortingApp.class.getName());

    static {
        StringFormatter formatter = new StringFormatter();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(formatter);

        for (Handler iHandler : LOGGER.getParent().getHandlers()) {
            LOGGER.getParent().removeHandler(iHandler);
        }
        LOGGER.addHandler(consoleHandler);
    }

    public static void main(String[] args) {
        sortAndPrintArray(args);
    }

    private static void sortAndPrintArray(String[] args){

        if (args.length == 0){
            LOGGER.log(Level.SEVERE, "arguments are missing");
            return;
        }

        if (args.length > 10){
            LOGGER.log(Level.SEVERE, "too much arguments. Try to enter less then 11 arguments");
            return;
        }
        int[] integerArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            integerArray[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(integerArray);
        printArray(integerArray);
    }


    private static void printArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }
}