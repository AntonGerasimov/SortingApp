package org.gerasimov.sorting;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.Arrays;

import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class ArraySorterTest {
    private ArraySorter arraySorter;

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
        String[] input = {};
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> arraySorter.sort(input));
        assertEquals("Arguments are missing", exception.getMessage());

    }

    @Test
    public void shouldThrowExceptionWhenArrayHasTooMuchElements() {
        String[] input = new String[11];
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> arraySorter.sort(input));
        assertEquals("Too much arguments. Try to enter less then 11 arguments", exception.getMessage());

    }

    @ParameterizedTest
    @EmptySource
    public void shouldLogCorrectlyEmptyArrayParameterized(String[] input) {
        ArraySorter arraySorterParameterized = new ArraySorter();

        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> arraySorterParameterized.sort(input));
        assertEquals("Arguments are missing", exception.getMessage());
    }


    @ParameterizedTest
    @MethodSource("arraySortedOneElement")
    void shouldSortCorrectlySortedArrayOneElement(String[] inputArray) {

        ArraySorter arraySorter = new ArraySorter();

        String actual = arraySorter.sort(inputArray);

        StringBuilder stringBuilder = new StringBuilder();
        for (String input : inputArray
        ) {
            stringBuilder.append(input + " ");
        }
        String expected = stringBuilder.toString().trim();
        assertEquals(expected, actual);
    }


    static Stream<Arguments> arraySortedOneElement() {
        return Stream.of(
                Arguments.of((Object) new String[]{"1"}),
                Arguments.of((Object) new String[]{"2"}),
                Arguments.of((Object) new String[]{"5"}),
                Arguments.of((Object) new String[]{"8"}),
                Arguments.of((Object) new String[]{"11"}),
                Arguments.of((Object) new String[]{"15"})
        );
    }

    @ParameterizedTest
    @MethodSource("arraySortedTenElement")
    void shouldSortCorrectlySortedArrayTenElementsParameterized(String[] inputArray) {

        ArraySorter arraySorter = new ArraySorter();

        String actual = arraySorter.sort(inputArray);

        StringBuilder stringBuilder = new StringBuilder();
        for (String input : inputArray
        ) {
            stringBuilder.append(input + " ");
        }
        String expected = stringBuilder.toString().trim();
        assertEquals(expected, actual);
    }


    static Stream<Arguments> arraySortedTenElement() {
        return Stream.of(
                Arguments.of((Object) new String[]{
                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}),
                Arguments.of((Object) new String[]{
                        "11", "21", "31", "41", "51", "61", "71", "81", "91", "101"}),
                Arguments.of((Object) new String[]{
                        "15", "24", "35", "46", "55", "62", "73", "81", "98", "107"}),
                Arguments.of((Object) new String[]{
                        "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayUnsortedTenElement")
    void shouldSortCorrectlyUnsortedArrayTenElementsParameterized(String[] inputArray) {

        ArraySorter arraySorter = new ArraySorter();

        String actual = arraySorter.sort(inputArray);

        int[] integerArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            integerArray[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(integerArray);

        StringBuilder stringBuilder = new StringBuilder();
        for (int input : integerArray
        ) {
            stringBuilder.append(input + " ");
        }
        String expected = stringBuilder.toString().trim();
        assertEquals(expected, actual);
    }


    static Stream<Arguments> arrayUnsortedTenElement() {
        return Stream.of(
                Arguments.of((Object) new String[]{
                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}),
                Arguments.of((Object) new String[]{
                        "11", "21", "31", "41", "51", "61", "71", "81", "91", "101"}),
                Arguments.of((Object) new String[]{
                        "15", "24", "35", "46", "55", "62", "73", "81", "98", "107"}),
                Arguments.of((Object) new String[]{
                        "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000"})
        );
    }


}
