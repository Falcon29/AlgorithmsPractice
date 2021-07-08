package lesson0;

public class ClimbingStairs {
    public static void main( String[] args ) {
        System.out.println(climbStairsOne( 43 ));
        System.out.println(climbStairsTwo( 43 ));
    }

    /**
     * p(n) ways;
     * The faster way: by 2 => n-2
     * The slower way: by 1 => n-1
     * p(n) = p(n-1) + p(n-2)
     *
     */

    private static int climbStairsOne(int n) {
        int dp = 1, p = 2;

        for (int i = 1; i < n; i++ ) {
            int temp = p + dp;
            dp = p;
            p = temp;
        }

        return dp;
    }

    private static int climbStairsTwo(int n) {
        if (n == 1) return 1;

        int[] array = new int[n]; //n always >= 2
        array[0] = 1; //because of maximum 2 steps, first element = 1, second = 2 (always)
        array[1] = 2;

        for (int i = 2; i < n; i++) { //starts from 3rd element of array
            array[i] = array[i-1] + array[i-2]; //array[2] = 1 + 2, array[3] = 2 + 3, array[4] = 3 + 4
        }

        return array[n-1];
    }
}
