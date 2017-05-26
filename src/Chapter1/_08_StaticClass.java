package Chapter1;

/**
 * Created by qifu on 17/5/25.
 */
/* Write a program that demonstrates that, no matter how many objects you
* create of a particular class, there is only one instance of a particular
* static field of that class.
*/
class _StaticTest {
    static int i = 47;
}
class _Incrementable {
    static void increment() {
        _StaticTest.i++;
    }
}
public class _08_StaticClass {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTest.i);
        _StaticTest st1 = new _StaticTest();
        _StaticTest st2 = new _StaticTest();

        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);

        _Incrementable _inc = new _Incrementable();
        _inc.increment();
        System.out.println("After inc.increment");
        System.out.println("StaticTest.i = " + _StaticTest.i);
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);

        _StaticTest st3 = new _StaticTest();
        System.out.println("st3.i = " + st3.i);
    }
}
/*
Output:
StaticTest.i = 47
st1.i = 47
st2.i = 47
After inc.increment
StaticTest.i = 48
st1.i = 48
st2.i = 48
st3.i = 48

 */