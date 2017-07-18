package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Ex10Interface {
    void say();
}
public class _10_Ex10 {
    Ex10Interface f(boolean b) {
        if(b) {
            class Inner implements Ex10Interface{

                @Override
                public void say() {
                    System.out.println("Hi");
                }
            }
            return new Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        _10_Ex10 ex = new _10_Ex10();
        ex.f(true).say();
    }
}
