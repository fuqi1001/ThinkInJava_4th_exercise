package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */
interface In {
    class Nested {
        Nested() {
            System.out.println("Inner create");
        }
        public void hi() {
            System.out.println("hi");
        }
//        public static void main(String[] args) {
//            new In.Nested();
//        }
    }
}
public class _20_Ex20 implements In{
    public static void main(String[] args) {
        In.Nested in = new In.Nested();
        in.hi();
    }
}