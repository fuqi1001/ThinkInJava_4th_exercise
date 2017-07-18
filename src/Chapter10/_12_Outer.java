package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Inner12 {
    void modifyOuter();
}
public class _12_Outer {
    private int oi = 1;
    private void hi() {
        System.out.println("Outer hi");
    }
    public Inner12 inner() {
        return new Inner12() {
            public void modifyOuter() {
                oi *= 2;
                hi();
            }
        };
    }

    public void showOi() {
        System.out.println(oi);
    }

    public static void main(String[] args) {
        _12_Outer out = new _12_Outer();
        out.showOi();
        out.inner().modifyOuter();
        out.showOi();
    }
}
