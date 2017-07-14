package Chapter9;

/**
 * Created by qifu on 17/7/14.
 */
interface FastFood {
    void cheeseburger();
    void fries();
    void softDrink();
}
class Meal {
    Meal() {
        System.out.println("Meal");
    }
}
class Bread {
    Bread() {
        System.out.println("Bread");
    }
}
class Cheese {
    Cheese() {
        System.out.println("Cheese");
    }
}
class Lettuce {
    Lettuce() {
        System.out.println("Lettuce");
    }
}
class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch");
    }
}
class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch");
    }
}
public class _08_Sandwich8 extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lunch l = new Lunch();
    public _08_Sandwich8() {
        System.out.println("Create Sandwich8()");
    }
    @Override
    public void cheeseburger() {
        System.out.println("Create cheeseburger()");
    }

    @Override
    public void fries() {
        System.out.println("Create fries()");
    }

    @Override
    public void softDrink() {
        System.out.println("Create softDrink()");
    }

    public static void main(String[] args) {
        _08_Sandwich8 s = new _08_Sandwich8();
        s.cheeseburger();
        s.fries();
        s.softDrink();
    }
}
