package Chapter10;

/**
 * Created by qifu on 17/7/17.
 */
public class _01_Outer1 {
    class Inner {
        Inner() {
            System.out.print("Inner class");
        }
    }

    _01_Outer1() {
        System.out.println("Outer1 class");
    }

    Inner makeInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        _01_Outer1 o = new _01_Outer1();
        Inner i = o.makeInner();
    }
}