package org.gerasimov.sorting;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@Category(ArraySorterTest.class)
public class ArraySorterTestParameterized {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "0", "0", "0"}, { "1", "1", "2" }
        });
    }

}

