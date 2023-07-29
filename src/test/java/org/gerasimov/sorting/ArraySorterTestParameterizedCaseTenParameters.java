package org.gerasimov.sorting;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@Category(ArraySorterTest.class)
public class ArraySorterTestParameterizedCaseTenParameters {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new String[][][]{
                {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}, {"0 0 0 0 0 0 0 0 0 0"}},
                {{"0", "2", "1", "6", "5", "4", "9", "7", "8", "3"}, {"0 1 2 3 4 5 6 7 8 9"}},
                {{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"0 1 2 3 4 5 6 7 8 9"}},
                {{"3", "2", "1", "6", "5", "4", "9", "8", "7", "0"}, {"0 1 2 3 4 5 6 7 8 9"}}
        });
    }

    private final ArraySorter arraySorter;
    private final String[] inputArray;
    private final String expectedString;

    public ArraySorterTestParameterizedCaseTenParameters(String[] inputArray,
                                                         String[] expectedString) {
        this.arraySorter = new ArraySorter();
        this.inputArray = inputArray;
        this.expectedString = expectedString[0];
    }

    @Test
    public void shouldSortCorrectlyArrayWithTenElements() {
        String actualString = arraySorter.sort(inputArray);
        assertEquals(expectedString, actualString);
    }

}
