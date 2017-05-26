package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
// Modify the previous exercise so that the values of the data in DataOnly are
// assigned to and printed in main().

public class _05_DataOnly {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.1234545;
        data.b = true;
        data.show();
    }
}
/*
output:
234
2.1234545
true
 */