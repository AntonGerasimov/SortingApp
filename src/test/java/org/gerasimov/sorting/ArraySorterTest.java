package org.gerasimov.sorting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class ArraySorterTest {
    private ArraySorter arraySorter;

    @Rule
    public ExpectedException thrownException = ExpectedException.none();

    @Before
    public void beforeEach() {
        arraySorter = new ArraySorter();
    }

    @Test
    public void shouldSortCorrectlyUnsortedArray() {
        String[] inputArray = {"0", "-1", "1"};
        String actual = arraySorter.sort(inputArray);
        assertEquals("-1 0 1", actual);
    }

    @Test
    public void shouldSortCorrectlySortedArray() {
        String[] inputArray = {"0", "2", "4"};
        String actual = arraySorter.sort(inputArray);
        assertEquals("0 2 4", actual);
    }

    @Test
    public void shouldThrowExceptionWhenArrayIsEmpty() {
        String[] inputArray = {};

        thrownException.expect(IllegalArgumentException.class);
        thrownException.expectMessage("Input array is empty");
        arraySorter.sort(inputArray);
    }


    @Test
    public void shouldThrowExceptionWhenArrayHasTooMuchElements() {
        String[] inputArray = new String[11];

        thrownException.expect(IllegalArgumentException.class);
        thrownException.expectMessage("Too much arguments. Try to enter less then 11 arguments");
        arraySorter.sort(inputArray);
    }

    @Test
    public void shouldThrowExceptionWhenArrayContainsNonIntegerElement_StringCase(){
        String[] inputArray = {"1", "2", "three", "4"};

        thrownException.expect(IllegalArgumentException.class);
        thrownException.expectMessage("Input array contains invalid elements. All elements should be whole numbers");
        arraySorter.sort(inputArray);
    }

    @Test
    public void shouldThrowExceptionWhenArrayContainsNonIntegerElement_DoubleCase(){
        String[] inputArray = {"1", "2", "1.1", "4"};

        thrownException.expect(IllegalArgumentException.class);
        thrownException.expectMessage("Input array contains invalid elements. All elements should be whole numbers");
        arraySorter.sort(inputArray);
    }


}
