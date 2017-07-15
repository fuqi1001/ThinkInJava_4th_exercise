package Chapter9;

/**
 * Created by qifu on 17/7/14.
 */
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
interface CanClimb {
    void climb();
}
class ActionCharacter {
    public void fight() {System.out.println("Action");}
}

class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim {

    @Override
    public void climb() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

public class _12_Adventure {
    public static void c(CanClimb x) {x.climb();}
    public static void s(CanSwim x) {x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void f(CanFight x) {x.fight();}
    public static void w(ActionCharacter x) {x.fight();}
    public static void main(String[] args) {
        Hero h = new Hero();
        c(h);
        s(h);
        v(h);
        f(h);
        w(h);
    }
}