package Chapter9;

/**
 * Created by qifu on 17/7/17.
 */
interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride unicycle");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride Bicycle");
    }
}
class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride Tricycle");
    }
}
class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class _18_Cycles {
    public static void rideCycle(CycleFactory cf) {
        Cycle c = cf.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
