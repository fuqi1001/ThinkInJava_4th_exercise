package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
// Show that hex and octal notations work with long values.
// Use Long.toBinaryString to display the results.

public class _08_LongValues {
    public static void main(String[] args) {
        long n1 = 0xffff; // hexadecimal
        long n2 = 077777; // octal
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
