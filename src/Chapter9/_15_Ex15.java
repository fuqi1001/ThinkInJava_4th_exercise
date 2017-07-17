package Chapter9;

/**
 * Created by qifu on 17/7/17.
 */
interface History {
    void u();
    void v();
}
interface Exam {
    void w();
    void x();
}
interface Lab {
    void y();
    void z();
}
interface Workup extends History, Exam, Lab {
    void zz();
}

abstract class Doctor {
    private int i = 0;
    abstract void doc() ;
}
class Anesthesiologist extends Doctor implements Workup {
    private int j = 0;
    @Override
    public void zz() {
        System.out.println("zz");
    }

    @Override
    public void w() {
        System.out.println("w");
    }

    @Override
    public void x() {
        System.out.println("x");
    }

    @Override
    public void u() {
        System.out.println("u");
    }

    @Override
    public void v() {
        System.out.println("v");
    }

    @Override
    public void y() {
        System.out.println("y");
    }

    @Override
    public void z() {
        System.out.println("z");
    }

    @Override
    void doc() {
        System.out.println("Override doc");
    }
}

public class _15_Ex15 {
    public static void m1(History his) {his.u();}
    public static void m2(Exam ex) {ex.w();}
    public static void m3(Lab lab) {lab.y();}
    public static void m4(Workup wk) {wk.zz();}
    public static void main(String[] args) {
        Anesthesiologist an = new Anesthesiologist();
        m1(an);
        m2(an);
        m3(an);
        m4(an);
        an.doc();
    }
}
