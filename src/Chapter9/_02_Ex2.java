package Chapter9;

/**
 * Created by qifu on 17/7/13.
 */
abstract class Nogo1 {
    Nogo1 () {
        System.out.println("Nogo1");
    }
}
abstract class Nogo2 {}

class Go1 extends Nogo1 {
    Go1() {
        System.out.println("Go1");
    }
}
public class _02_Ex2 {
    public static void main(String[] args) {
        // Nogo1 and Nogo2 cannot be instantiated:
        // Nogo1 ng1 = new Nogo1();
        // Nogo2 ng2 = new Nogo2();
        // But Nogo1() constructor called during instatiation of child:
        Go1 g = new Go1();
    }
}