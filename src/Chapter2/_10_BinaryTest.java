package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
/* Write a program with two constant values, one with alternating binary ones and
* zeroes, with a zero in the least-significant digit, and the second, also
* alternating, with a one in the least-significant digit (hint: It's easiest to
* use hexadecimal constants for this). Take these two values and combine them in
* all possible ways using the bitwise operators, and display the results using
* Integer.toBinaryString().
*/
public class _10_BinaryTest {
    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
    }
}
/*
i = 1010101
j = 10101010
i & j = 0
i | j = 11111111
i ^ j = 11111111
~i = 11111111111111111111111110101010
~j = 11111111111111111111111101010101
 */
