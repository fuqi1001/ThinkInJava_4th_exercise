package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _07_AutomaticConstructor {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
class Aso {
    void bark() {System.out.println("woof");}
}
