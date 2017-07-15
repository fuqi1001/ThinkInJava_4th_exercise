package Chapter9;

/**
 * Created by qifu on 17/7/14.
 */
interface CanDo {
    void doIt();
}
interface CanDoMore extends CanDo {
    void doMore();
}
interface CanDoFast extends CanDo {
    void doFast();
}
interface CanDoMost extends CanDoFast, CanDoMore {
    void doMost();
}
class Actor implements CanDoMost {

    @Override
    public void doMost() {
        System.out.println("doMost");
    }

    @Override
    public void doFast() {
        System.out.println("doFast");
    }

    @Override
    public void doMore() {
        System.out.println("doMore");
    }

    @Override
    public void doIt() {
        System.out.println("doIt");
    }
}
public class _13_DiamondInheritance {
    public static void main(String[] args) {
        Actor a = new Actor();
        a.doFast();
        a.doIt();
        a.doMore();
        a.doMost();

        ((CanDoFast)a).doFast();
        ((CanDoMore)a).doMore();
        ((CanDo)a).doIt();
    }
}

