package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class Cycle {
    private String name = "Cycle";
    private int wheels = 0;
    public static void travel(Cycle c) {
        System.out.println("Cycle.ride()" + c);
    }
    public String toString() {
        return this.name;
    }
    public int wheels() {return wheels;}
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;
    @Override
    public int wheels() {
        return wheels;
    }
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;
    @Override
    public int wheels() {
        return wheels;
    }
    public String toString() {
        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    private int wheels = 3;
    @Override
    public int wheels() {
        return wheels;
    }
    public String toString() {
        return this.name;
    }
}
public class _05_Biking {
    public static void ride(Cycle c) {
        c.travel(c);
        System.out.println(c.wheels());
    }
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
