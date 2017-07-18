package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
class Outer_ {
    class Inner {
        Inner() {
            System.out.println();
        }
        //返回外部类对象
        public Outer_ back_ot() {
            return Outer_.this;
        }
    }
}
public class _05_Outer {
    public static void main(String[] args) {
        Outer_ ot = new Outer_();
        //使用外部类对象穿件内部类
        Outer_.Inner in = ot.new Inner();
    }
}
