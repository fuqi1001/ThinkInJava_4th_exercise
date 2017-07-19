package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */
public class _18_Ex18 {
    Ex18() {
        System.out.println("Ex18 constructor");
    }
    public static class Ex18Inner1 {
        Ex18Inner1() {
            System.out.println("inner1");
        }
    }
    private static class Ex18Inner2 {
        Ex18Inner2() {
            System.out.println("inner2");
        }
    }

    public static void main(String[] args) {
        Ex18Inner1 en1 = new Ex18Inner1();
        Ex18Inner2 en2 = new Ex18Inner2();
    }
}
