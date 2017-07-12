package Chapter7;

/**
 * Created by qifu on 17/7/12.
 */
class WithFinals{
    private final void f() {
        System.out.println("WithFinals f()");
    }
    //auto final
    private void g() {
        System.out.println("WithFinals g()");
    }
}

class OverridingPrivate extends WithFinals {
    //attempt to override:
    private final void f() {
        System.out.println("Overriding private f()");
    }
    private void g() {
        System.out.println("Overriding private g()");
    }

    //@Override: compiler finds error
    //@Override private final void f() {System.out.println("Overriding private f()");}
    //@Override private void g() {System.out.println("Overriding private g()");}
}

class OverridingPrivate2 extends OverridingPrivate {
    // attempt to override:
    public final void f(){
        System.out.println("f()");
    }
    public void g() {
        System.out.println("g()");
    }
    //use @Override so compiler with say "does Not override or implement"
    //@Override public final void f() {System.out.println("f()");}
    //@Override public void g() {System.out.println("g()");}
}
public class FinalOverridingIllusionEx {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        //upcast;
        OverridingPrivate op = op2;
        //but you cant call the methods
        WithFinals wf = op2;

    }
}