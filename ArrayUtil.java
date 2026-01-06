import java.util.Random;

public class ArrayUtil {

    // Random object used to generate random numbers
    public static final Random generator = new Random();

    /**
     * Generates an array of random integers.
     *
     * @param length the size of the array
     * @param n the upper bound (exclusive) for random numbers
     * @return an array filled with random integers
     */
    public static int[] randomIntArray(int length, int n) {

        // Create an integer array of the given length
        int[] a = new int[length];

        // Fill the array with random integers from 0 to n-1
        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }

        // Return the generated array
        return a;
    }

    /**
     * Swaps two elements in an integer array.
     *
     * @param a the array
     * @param i index of the first element
     * @param j index of the second element
     */
    public static void swap(int[] a, int i, int j) {

        // Store the value of a[i] temporarily
        int temp = a[i];

        // Assign the value of a[j] to a[i]
        a[i] = a[j];

        // Assign the temporary value to a[j]
        a[j] = temp;
    }
}
