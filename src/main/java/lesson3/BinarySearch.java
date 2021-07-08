package lesson3;

import java.util.Arrays;

public class BinarySearch {
    public static void main( String[] args ) {
        System.out.print( binarySearch( new int[]{1, 3, 44, 125, 111, 2, 31, 123}, 123 )  );
    }

    public static int binarySearch(int[] array, int key) {
        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
