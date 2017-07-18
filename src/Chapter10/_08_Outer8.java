package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
public class _08_Outer8 {
    class Inner {
        private int i = 1;
        private int i1 = 2;

        private void show() {
            System.out.println(i);
        }
        private void show2() {
            System.out.println("hi");
        }
    }

    int o1 = new Inner().i;
    void showi() {
        System.out.println(o1);
    }
    void showi2() {
        new Inner().show();
    }
    void OuterShow() {
        new Inner().show2();
    }


    public static void main(String[] args) {
        _08_Outer8 ot = new _08_Outer8();
        ot.showi();
        ot.showi2();
        ot.OuterShow();
    }
}
