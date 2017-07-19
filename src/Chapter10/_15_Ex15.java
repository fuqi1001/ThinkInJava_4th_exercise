package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
class One {
    private String s;
    One(String s) {
        this.s = s;
    }
    public String toString() {
        return s;
    }
}
public class _15_Ex15 {
    public One makeOne(String s) {
        return new One(s);
    }
    public static void main(String[] args) {
        _15_Ex15 x = new _15_Ex15();
        System.out.println(x.makeOne("xxx").toString());
    }
}
