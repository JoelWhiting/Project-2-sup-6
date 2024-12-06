package main; 

import java.util.*;

/**
 * A demonstration class for the {@link UtilityFunctions} utility class.
 * This class showcases how to use its methods to generate a random list,
 * convert it to a map of occurrences, and sort the list.
 */
public class Main {

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Generate a random list of integers
        System.out.println("Generating a random list of integers...");
        List<Integer> randomList = UtilityFunctions.generateRandomList(10);
        System.out.println("Random List: " + randomList);

        // Convert the list to a map of occurrences
        System.out.println("\nConverting the list to a map of occurrences...");
        Map<Integer, Integer> occurrencesMap = UtilityFunctions.convertListToMap(randomList);
        System.out.println("Occurrences Map: " + occurrencesMap);

        // Sort the list in ascending order
        System.out.println("\nSorting the list in ascending order...");
        List<Integer> sortedList = UtilityFunctions.sortListAscending(randomList);
        System.out.println("Sorted List: " + sortedList);
    }
}
