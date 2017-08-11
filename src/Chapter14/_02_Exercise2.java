package Chapter14;

/**
 * Created by qifu on 17/8/10.
 */
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Files {}
class Toy {
    // With default constructor commented out will be
    // unable to instantiate this Toy, super of FancyToy:
    static {
        System.out.println("loading Toy");
    }
    Toy() {}
    Toy(int i ) {}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Files {
    static {
        System.out.println("loading FancyToy");
    }
    FancyToy() {
        super(1);
    }
}

public class _02_Exercise2 {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is Interface? [" +cc.isInterface()+"]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        Class c = null;
        try {
            c = Class.forName("TypeInfo.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }

        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();   //super class
        Object obj = null;

        try {
            //require default constructor
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot Access");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}
