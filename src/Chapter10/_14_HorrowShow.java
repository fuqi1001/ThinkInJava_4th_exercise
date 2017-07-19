package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampire implements Vampire{

    @Override
    public void drinkBlood() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void menace() {

    }
}
public class _14_HorrorShow14 {
    static void u(Monster b) {
        b.menace();
    }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Dangerous Monster destroy");
            }

            @Override
            public void menace() {
                System.out.println("Dangerous Monster menace");
            }
        };
    }

    public Vampire vampireMaker() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire Drinkblood");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire destroy");
            }

            @Override
            public void kill() {
                System.out.println("Vampire kill");
            }

            @Override
            public void menace() {
                System.out.println("Vampire menace");
            }
        };
    }
    public static void main(String[] args) {
        _14_HorrorShow14 show = new _14_HorrorShow14();
        show.u(show.monsterMaker());
        show.v(show.monsterMaker());
        show.u(show.vampireMaker());
        show.v(show.vampireMaker());
        show.w(show.vampireMaker());

        _14_HorrorShow14.u(show.monsterMaker());
        //

    }
}
