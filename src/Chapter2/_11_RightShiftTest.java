package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
/* Start with a number that has a binary one in the most significant position
* (hint: Use a hexadecimal constant). Using the signed right-shift operator,
* right shift it all the way through all of its binary positions each time
* displaying the result using Integer.toBinaryString().
*/
public class _11_RightShiftTest {
    public static void main(String [] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 28; i++) {
            h >>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
/*
output:
10000000000000000000000000000
1000000000000000000000000000
100000000000000000000000000
10000000000000000000000000
1000000000000000000000000
100000000000000000000000
10000000000000000000000
1000000000000000000000
100000000000000000000
10000000000000000000
1000000000000000000
100000000000000000
10000000000000000
1000000000000000
100000000000000
10000000000000
1000000000000
100000000000
10000000000
1000000000
100000000
10000000
1000000
100000
10000
1000
100
10
1
 */