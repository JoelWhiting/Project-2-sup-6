package main.java;

import java.util.*;

/**
 * A utility class providing functions for generating and manipulating lists of integers.
 */
public class UtilityFunctions {

    /**
     * Generates a list of random integers.
     *
     * @param size the size of the list to generate
     * @return a list of random integers
     */
    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100)); // Random integers between 0 and 99
        }
        return randomList;
    }

    /**
     * Converts a list of integers into a map where each integer is a key,
     * and its value is the number of occurrences in the list.
     *
     * @param list the list of integers
     * @return a map of integers and their occurrences
     */
    public static Map<Integer, Integer> convertListToMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    /**
     * Sorts a list of integers in ascending order.
     *
     * @param list the list of integers
     * @return a new list sorted in ascending order
     */
    public static List<Integer> sortListAscending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}
