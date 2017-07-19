package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */
interface U {
    void f();
    void g();
    String toString();
}

class A {
    U buildU() {
        return new U() {

            @Override
            public void f() {
                System.out.println("f() in A");
            }

            @Override
            public void g() {
                System.out.println("g() in A");
            }

            @Override
            public String toString() {
                return "I'm a U in class A";
            }
        };
    }
}

class B {
    private U[] us;
    B(int i ) {
        us = new U[i];
    }
    void addU(U u, int i) {
        us[i] = u;
    }
    void clearU(int i ){
        us[i] = null;
    }
    void testU() {
        for(U u : us) {
            u.f();
            u.g();
            u.toString();
        }
    }

    void showU() {
        for(U u : us) {
            if(u != null) System.out.println(u.toString());
            else {
                System.out.println("I'm null");
            }
        }
    }
}
public class _23_Ex23 {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new A();
        A a2 = new A();

        B b = new B(3);
        b.addU(a0.buildU(), 0);
        b.addU(a1.buildU(), 1);
        b.addU(a2.buildU(), 2);

        b.showU();
        b.testU();
        b.clearU(0);
        b.clearU(1);
        b.showU();
    }
}
