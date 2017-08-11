package Chapter14;

/**
 * Created by qifu on 17/8/10.
 */
class A {}
class B extends A {}
class C extends B {}

public class _08_Exercise8 {
    public static void Hierarchy(Object o) {
        if(o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is subclass of" +
                    o.getClass().getSuperclass());
            try {
                Hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e ) {
                System.out.println("Unable to instance object");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }
    }
    public static void main(String[] args) {
        Hierarchy(new C());
    }
}

