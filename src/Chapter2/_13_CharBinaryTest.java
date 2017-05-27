package Chapter2;

/**
 * Created by qifu on 17/5/27.
 */
/* Write a method that displays char values in binary form. Demonstrate it
* using several different characters.
*/
public class _13_CharBinaryTest {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c +=1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for(int i = 0; i < 26; i++) {
            c +=1;
            System.out.println(Integer.toBinaryString(c));
        }
    }
}
