package Chapter14;

/**
 * Created by qifu on 17/8/10.
 */
class Candy {
    static {
        System.out.println("loading Candy");
    }
}
class Gum {
    static {
        System.out.println("loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cooike");
    }
}

public class _07_Exercise7 {
    public static void main(String[] args) {
        /*System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cooike");

*/
        if(args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println("Enjoy your: " + args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Count not find " + args[0]);
        }
    }
}