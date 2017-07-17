package Chapter9._16_CharGen;

import java.util.Random;

/**
 * Created by qifu on 17/7/17.
 */
public class RandomChar {
    private static Random rand = new Random();
    public char next() {
        return (char)rand.nextInt(128);
    }
    public static void main(String[] args) {
        RandomChars rc = new RandomChars();
        for(int i = 0; i < 10; i++) {
            System.out.println(rc.next()+" ");
        }
    }
}
