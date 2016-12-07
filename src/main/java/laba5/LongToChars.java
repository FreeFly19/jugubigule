package laba5;

public class LongToChars {
    public static char[] getChars(long num) {
        final char[] arr = new char[(int) (Math.log10(num) + 1)];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (char) ('0' + (num % 10));
            num /= 10;
        }
        return arr;
    }
}
