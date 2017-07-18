package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
public class _07_Outer {
    private int i = 1;
    private void hi() {
        System.out.println("Hi");
    }

    class Inner {
        Inner() {};
        void modifier(){
            i += 1;
            hi();
        }
    }

    public void show(){
        System.out.println(i);
    }
    public void testInner() {
        Inner in = new Inner();
        in.modifier();
    }

    public static void main(String[] args) {
        _07_Outer ot = new _07_Outer();
        ot.show();
        ot.testInner();
        ot.show();
    }
}
