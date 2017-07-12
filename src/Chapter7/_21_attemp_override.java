package Chapter7;

/**
 * Created by qifu on 17/7/12.
 */
class WithFinal {
    final void f() {
        System.out.println("f() wf");
    }
    void g() {
        System.out.println("g() wf");
    }
    final void h() {
        System.out.println("h() wf");
    }
}

class OverrideFinal extends WithFinal {
    //attempt to override:
    /*
    public final void f() {
        System.out.println("Override f()");
    }
    fail
    */

    @Override
    public void g() {
        System.out.println("override g()");
    }

    // final void h() {System.out.println("override h()");}
    //fail
}
public class _21_attemp_override {
    public static void main(String[] args) {
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();

        //upcast
        WithFinal wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}