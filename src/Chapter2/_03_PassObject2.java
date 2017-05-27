package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
// Create a class containing a float and use it to demonstrate aliasing during
// method calls

class Box {
    float a;
}
public class _03_PassObject2 {
    static void f(Box y) {
        y.a = 2.333f;
    }
    public static void main(String[] args) {
        Box x = new Box();
        x.a = 6.66f;
        System.out.println("x.a: "+x.a);
        f(x);
        System.out.println("x.a: "+x.a);
    }
}

/*
Output:
x.a: 6.66
x.a: 2.333
 */
