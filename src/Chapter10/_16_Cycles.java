package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {
        System.out.println("Create Unicycle");
    }
    @Override
    public void ride() {
        System.out.println("Ride Unicycle");
    }
    public static CycleFactory factory =
            new CycleFactory() {
                @Override
                public Cycle getCycle() {
                    return new Unicycle();
                }
            };
}
class Bicycle implements Cycle {
    private Bicycle() {
        System.out.println("Create Bicycle");
    }
    public void ride() {
        System.out.println("Ride Bicycle");
    }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Bicycle(); }
            };
}

class Tricycle implements Cycle {
    private Tricycle() { System.out.println("Create Tricycle"); }
    public void ride() { System.out.println("Ride Tricycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Tricycle(); }
            };
}

public class _16_Cycles {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
