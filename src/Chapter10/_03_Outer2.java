package Chapter10;

/**
 * Created by qifu on 17/7/17.
 */
public class _03_Outer {
    private String s;
    class Inner {
        Inner() {
            System.out.print("Inner class");

        }
        public String toString(){
            System.out.println(s);
            return s;
        }
    }

    _03_Outer(String s) {
        System.out.println("Outer1 class");
        this.s = s;
    }

    Inner makeInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        _03_Outer o = new _03_Outer("33");
        Inner i = o.makeInner();
        i.toString();
    }
}