package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
/*
Turn the DataOnly code fragments into a program that compiles and runs
 */
public class _04_DataOnly {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println("i: " +i);
                System.out.println("d: "+d);
                System.out.println("b: "+b);
            }
        }

        DataOnly data = new DataOnly();
        data.i = 1;
        data.d = 0.1;
        data.b = false;
        data.show();
    }
}
/*
output:
i: 1
d: 0.1
b: false
 */
