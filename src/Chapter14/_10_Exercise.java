package Chapter14;

/**
 * Created by qifu on 17/8/10.
 */
public class _10_Exercise {
    public static void main(String[] args) {
        char[] c = new char[10];
        //c is an Object
        System.out.println("Superclass of char[] " +
                c.getClass().getSuperclass());
        System.out.println("char[] c instanceof object: " +
                (c instanceof Object));
    }
}
