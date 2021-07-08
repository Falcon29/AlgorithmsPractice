package lesson0;

public class Palindrome {
    public static void main( String[] args ) {
        System.out.println(isPalindrome( 199 ));
        System.out.println(isPalindrome( 1919119191 ));
    }

    //Is argument number palindrome?
    private static boolean isPalindrome(int x) {
        if (x < 0) return false;

        char[] xArr = String.valueOf(x).toCharArray();

        boolean isP = true;

        for (int i = 0; i <= xArr.length - 1; i++) {
            if (xArr[i] != xArr[xArr.length - (i + 1)]) {
                isP = false;
            }
        }

        return isP;
    }
}
