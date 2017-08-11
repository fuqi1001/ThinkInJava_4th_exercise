package Chapter14;

/**
 * Created by qifu on 17/8/10.
 */
class A {
    int i;
    String s;
}
class B extends A {
    int j;
    float f;
}
class C extends B {
    int k;
    boolean b;
}

public class _09_Exercise9 {
    public static void Hierarchy(Object o) {

        /*if(o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + " is subclass of" +
            o.getClass().getSuperclass());
            try {
                Hierarchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e ) {
                System.out.println("Unable to instance object");
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access");
            }
        }*/
        Object[] field = o.getClass().getDeclaredFields();
        if(field.length == 0) {
            System.out.println(o.getClass()+" has no field");
        }
        if(field.length > 0) {
            System.out.println("Field(s) of " + o.getClass() +": ") ;
            for(Object obj : field) {
                System.out.println(" " + obj);
            }
        }

    }
    public static void main(String[] args) {
        Hierarchy(new C());
    }
}
