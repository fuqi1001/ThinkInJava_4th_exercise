package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
// Display the largest and smallest numbers for both float and double
// exponential notation.
public class _09_MinMax {
    public static void main(String[] args) {
        double max = java.lang.Double.MAX_VALUE;
        System.out.println("Max double = " + max);
        double min = java.lang.Double.MIN_VALUE;
        System.out.println("Min double = " + min);
        float maxf = java.lang.Float.MAX_VALUE;
        System.out.println("Max float = " + maxf);
        float minf = java.lang.Float.MIN_VALUE;
        System.out.println("Min float = " + minf);

    }
}
/*
output:
Max double = 1.7976931348623157E308
Min double = 4.9E-324
Max float = 3.4028235E38
Min float = 1.4E-45
 */
