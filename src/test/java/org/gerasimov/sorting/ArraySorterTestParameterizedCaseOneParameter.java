package org.gerasimov.sorting;


import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@Category(ArraySorterTest.class)
public class ArraySorterTestParameterizedCaseOneParameter {

    @Parameters
    public static Collection data() {
        return Arrays.asList(new String[][][]{
                {{"0"}, {"0"}},
                {{"1"}, {"1"}},
                {{"2"}, {"2"}},
                {{"3"}, {"3"}},
                {{"4"}, {"4"}},
                {{"5"}, {"5"}},
                {{"6"}, {"6"}},
                {{"7"}, {"7"}},
                {{"8"}, {"8"}},
                {{"9"}, {"9"}},
                {{"10"}, {"10"}}
        });
    }

    private final ArraySorter arraySorter;
    private final String[] inputArray;
    private final String expectedString;

    public ArraySorterTestParameterizedCaseOneParameter(String[] inputArray,
                                                        String[] expectedString) {
        this.arraySorter = new ArraySorter();
        this.inputArray = inputArray;
        this.expectedString = expectedString[0];
    }

    @Test
    public void shouldSortCorrectlyArrayWithOneElement() {
        String actualString = arraySorter.sort(inputArray);
        assertEquals(expectedString, actualString);
    }


}


