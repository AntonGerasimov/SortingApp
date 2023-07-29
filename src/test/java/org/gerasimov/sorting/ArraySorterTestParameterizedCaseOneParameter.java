package org.gerasimov.sorting;


import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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

//    @ParameterizedTest
//    @EmptySource
//    public void shouldLogCorrectlyEmptyArrayParameterized(String[] input) {
//        ArraySorter arraySorterParameterized = new ArraySorter();
//
//        Throwable exception = assertThrows(
//                IllegalArgumentException.class,
//                () -> arraySorterParameterized.sort(input));
//        assertEquals("Arguments are missing", exception.getMessage());
//    }
//
//
//    @ParameterizedTest
//    @MethodSource("arraySortedOneElement")
//    void shouldSortCorrectlySortedArrayOneElement(String[] inputArray) {
//
//        ArraySorter arraySorter = new ArraySorter();
//
//        String actual = arraySorter.sort(inputArray);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String input : inputArray
//        ) {
//            stringBuilder.append(input + " ");
//        }
//        String expected = stringBuilder.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//
//    static Stream<Arguments> arraySortedOneElement() {
//        return Stream.of(
//                Arguments.of((Object) new String[]{"1"}),
//                Arguments.of((Object) new String[]{"2"}),
//                Arguments.of((Object) new String[]{"5"}),
//                Arguments.of((Object) new String[]{"8"}),
//                Arguments.of((Object) new String[]{"11"}),
//                Arguments.of((Object) new String[]{"15"})
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("arraySortedTenElement")
//    void shouldSortCorrectlySortedArrayTenElementsParameterized(String[] inputArray) {
//
//        ArraySorter arraySorter = new ArraySorter();
//
//        String actual = arraySorter.sort(inputArray);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String input : inputArray
//        ) {
//            stringBuilder.append(input + " ");
//        }
//        String expected = stringBuilder.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//
//    static Stream<Arguments> arraySortedTenElement() {
//        return Stream.of(
//                Arguments.of((Object) new String[]{
//                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}),
//                Arguments.of((Object) new String[]{
//                        "11", "21", "31", "41", "51", "61", "71", "81", "91", "101"}),
//                Arguments.of((Object) new String[]{
//                        "15", "24", "35", "46", "55", "62", "73", "81", "98", "107"}),
//                Arguments.of((Object) new String[]{
//                        "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"})
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("arrayUnsortedTenElement")
//    void shouldSortCorrectlyUnsortedArrayTenElementsParameterized(String[] inputArray) {
//
//        ArraySorter arraySorter = new ArraySorter();
//
//        String actual = arraySorter.sort(inputArray);
//
//        int[] integerArray = new int[inputArray.length];
//
//        for (int i = 0; i < inputArray.length; i++) {
//            integerArray[i] = Integer.parseInt(inputArray[i]);
//        }
//        Arrays.sort(integerArray);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int input : integerArray
//        ) {
//            stringBuilder.append(input + " ");
//        }
//        String expected = stringBuilder.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//
//    static Stream<Arguments> arrayUnsortedTenElement() {
//        return Stream.of(
//                Arguments.of((Object) new String[]{
//                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}),
//                Arguments.of((Object) new String[]{
//                        "11", "21", "31", "41", "51", "61", "71", "81", "91", "101"}),
//                Arguments.of((Object) new String[]{
//                        "15", "24", "35", "46", "55", "62", "73", "81", "98", "107"}),
//                Arguments.of((Object) new String[]{
//                        "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"})
//        );
//    }


