package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */

class FirstOuter {
    public class FirstInner {
        FirstInner(String s) {
            System.out.println("FirstOuter.FirstInner() " + s);
        }
    }
}
public class _26_SecondOuter {
    public class SecondInner extends FirstOuter.FirstInner {
        SecondInner(FirstOuter x) {
            x.super("hello");
            System.out.println("SecondOuter.SecondInner()");
        }
    }

    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        _26_SecondOuter so = new _26_SecondOuter();
        SecondInner si = so.new SecondInner(fo);
    }
}
