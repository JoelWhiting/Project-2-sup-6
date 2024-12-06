package test.java;

import main.UtilityFunctions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UtilityFunctionsTest {

    @Test
    void testGenerateRandomList() {
        List<Integer> randomList = UtilityFunctions.generateRandomList(10);
        assertEquals(10, randomList.size(), "List size should match the input parameter.");
    }

    @Test
    void testConvertListToMap() {
        List<Integer> inputList = Arrays.asList(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> result = UtilityFunctions.convertListToMap(inputList);
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
    }

    @Test
    void testSortListAscending() {
        List<Integer> inputList = Arrays.asList(5, 1, 3, 2, 4);
        List<Integer> sortedList = UtilityFunctions.sortListAscending(inputList);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedList, "List should be sorted in ascending order.");
    }
}
