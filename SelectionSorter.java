import java.util.Arrays;

public class SelectionSorter {

    public static void main(String[] args) {

        // Create an array of integers to be sorted
        int[] a = {
            50, 63, 29, 14, 86, 16, 79, 16, 26, 61,
            47, 64, 83, 18, 97, 92, 32, 54, 4, 88
        };

        // Print the array before sorting
        System.out.println(Arrays.toString(a));

        // Sort the array using Selection Sort
        SelectionSorter.sort(a);

        // Print the array after sorting
        System.out.println(Arrays.toString(a));
    }

    /**
     * Sorts an array using the Selection Sort algorithm.
     *
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {

        // Loop through each position in the array
        for (int i = 0; i < a.length; i++) {

            // Find the position of the smallest element
            // in the unsorted part of the array
            int minPos = minimumPosition(a, i);

            // Swap the smallest element with the current position
            ArrayUtil.swap(a, minPos, i);
        }
    }

    /**
     * Finds the position of the minimum element in the array
     * starting from a given index.
     *
     * @param a the array
     * @param from the starting index
     * @return the index of the minimum element
     */
    public static int minimumPosition(int[] a, int from) {

        // Assume the first element is the minimum
        int minPos = from;

        // Scan the rest of the array
        for (int i = from; i < a.length; i++) {

            // Update minPos if a smaller element is found
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }

        // Return the index of the smallest element
        return minPos;
    }
}
