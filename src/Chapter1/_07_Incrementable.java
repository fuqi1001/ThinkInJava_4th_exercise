package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
// Turn the Incrementable code fragments into a working program.
class StaticTest {
    static int i = 47;
}
class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
public class _07_Incrementable {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);

        Incrementable inc = new Incrementable();
        inc.increment();
        System.out.println("After inc.increment");
        System.out.println("StaticTest.i = " + StaticTest.i);
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}
/*
StaticTest.i = 47
st1.i = 47
st2.i = 47
After inc.increment
StaticTest.i = 48
st1.i = 48
st2.i = 48
 */
