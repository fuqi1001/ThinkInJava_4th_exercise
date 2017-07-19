package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */
interface In2 {
    String f();
    String g();
    class Nested {
        static void testIn(In2 i) {
            System.out.println(i.f() + i.g());
        }
    }
}
public class _21_Ex21 implements In2{

    @Override
    public String f() {
        return "hello";
    }

    @Override
    public String g() {
        return "friend";
    }

    public static void main(String[] args) {
        _21_Ex21 ex = new _21_Ex21();
        In2.Nested.testIn(ex);
    }
}
