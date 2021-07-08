package lesson2;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main( String[] args ) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        int[] stations = {0, 200, 375, 550, 750, 950};

        System.out.print( maxNumberFromDigits( digits ) );
        System.out.print( optimalStations( stations, 400 ) );
    }

    //На каждом шаге из исходного массива берется наибольшая цифра и ставится в начало строки
    private static String maxNumberFromDigits(int[] digs) {
        //{3, 1, 7, 9, 9, 5}  -> {1, 3, 7, 5, 9, 9}
        //sorting: O(n*log(n))
        //concat string: O(n)
        //complexity: O(n*log(n))

//        Arrays.sort(digs);
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = digs.length - 1; i >= 0; i--) {
//            result.append(digs[i]);
//        }

        //return result.toString();

        return String.join("",  //join string with delimiter ""
                Arrays.stream(digs).boxed() //boxed - stream of wrappers (simulate stream of primitives)
                .sorted(Collections.reverseOrder()) //sort by reversing order 1. 1, 2, 3... -> 2. 3, 2, 1...
                .map(String::valueOf)  //each element to string by value (1 -> "1")
                .toArray(String[]::new));  //to array of strings
    }

    private static int optimalStations(int[] stations, int capacity) {
        int length = stations.length;
        int count = 0;   //state count
        int current = 0;  //number of current state

        while (current < length - 1) {  //while number of current < last array's element number
            int next = current;  //create next == current

            while (next < length - 1 && stations[next + 1] - stations[current] <= capacity) {  //while next < last array's element number and sum < capacity
                next++; //next ++
            }

            if (current == next) { //when current = next -> fail
                return -1;
            }

            if (next < length - 1) {  //if next still < of last arrays element number
                count++;    //count++
            }

            current = next; //current == modified next
        }

        return count;
    }

}
