package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class Meal {
    Meal() {
        System.out.println("Super class, Meal()");
    }
}
class Bread {
    Bread() {
        System.out.println("Super class, Bread()");
    }
}
class Cheese {
    Cheese() {
        System.out.println("Super class, Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Super class, Lettuce()");
    }
}
class Pickle {
    Pickle() {
        System.out.println("Super class, Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Drived class, Lunch()");
    }
}
class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("Drived class, Port");
    }
}
public class _11_Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lettuce l = new Lettuce();
    private Sandwich() {
        System.out.println("Create Sandwich");
    }
    public static void main(String[] args) {
        new _11_Sandwich();
    }
}
