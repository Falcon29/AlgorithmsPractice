package lesson0;

public class LastWorldLength {
    public static void main( String[] args ) {
        System.out.println(lastWorldLength("Aaaaa aaa aaa aaaaaa"));
        System.out.println(lastWorldLength("A "));
    }

    private static int lastWorldLength(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 32 && count == 0) continue;
            if (s.charAt(i) == 32) return count;
            count++;
        }

        return count;
    }
}
