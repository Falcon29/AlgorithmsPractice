package lesson0;

public class PlusOneInArray {
    /**
     * Given a non-empty sorted array like a number. We need increment it by 1 but:
     * [1, 2, 3] + 1 => [1, 2, 4]
     * [4, 2, 9] + 1 => [4, 3, 0]
     */
    public static void main( String[] args ) {
        int[] array = new int[]{1, 3, 4, 5, 9};

    }

    private static int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {  //from end of array
            if ( array[i] != 9 ) {                     //if end not "9"
                array[i]++;                            //just +1 to end's number of array and return it
                return array;
            }
            array[i] = 0; //else make it 0
        }
        
        int[] newArray = new int[array.length + 1]; //create new array with size + 1 of old array (it will be array with 0's)
        newArray[0] = 1;  //make 1st array element equals 1 and return it
        return newArray;
    }
}
