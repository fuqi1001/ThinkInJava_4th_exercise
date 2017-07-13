package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class A {
    protected void f() {
        System.out.println("This is function A");
        this.g();
    }
    protected void g() {
        System.out.println("This is function B");
    }
}

class B extends A {
    @Override
    protected void g() {
        System.out.println("This is function B from class B");
    }
}
public class _10_Ex10 {
    public static void main(String[] args) {
        // automatic upgrade to base-class to call base-class method A.f()
        // which,by polymorphism, will call the derived-class method B.g():
        B b = new B();
        b.f();
    }
}
