package Chapter9._16_CharGen;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by qifu on 17/7/17.
 */
public class AdaptedRandomChars extends RandomChar implements Readable {
    private int count = 0;
    public AdaptedRandomChars(int count) {
        this.count = count;
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) +" ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(10));
        while(s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
