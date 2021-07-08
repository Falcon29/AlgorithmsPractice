package lesson0;

public class SearchInsertPosition {
    public static void main( String[] args ) {
        System.out.println(searchInsertPositionBinary(new int[]{1, 2, 3, 4, 5, 6}, 5));
    }

    private static int searchInsertPositionBinary(int[] nums, int target) {
        int start = 0, end = nums.length - 1;  //array edges

        while (start <= end) {
            int mid = (start + end) / 2; //middle index of array

            if (nums[mid] == target) {    //if element of array with middle index = target
                return mid;    //return this middle index
            } else if (nums[mid] > target) {   //but if it higher than target
                end = mid - 1; //set "end" edge on the previous mid position - 1
            } else {
                start = mid + 1; //if lower than target - start edge will be set on the previous mid pos + 1
            }
        }

        return start;
    }
}
