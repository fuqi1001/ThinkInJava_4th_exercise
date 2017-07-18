package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Ex9Interface {
    void say(String s);
}
public class _09_Ex9 {
    Ex9Interface f() {
        class Inner implements Ex9Interface {

            @Override
            public void say(String s) {
                System.out.println(s);
            }
        }
        return new Inner();
    }
    public static void main(String[] args) {
        _09_Ex9 ex = new _09_Ex9();
        ex.f().say("hi");
    }
}
