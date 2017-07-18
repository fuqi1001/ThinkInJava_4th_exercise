package Chapter10._06_Ex6;

import Chapter10._06_Ex6.pkg1.Ex6Interface;
import Chapter10._06_Ex6.pkg2.Ex6Base;

/**
 * Created by qifu on 17/7/18.
 */
public class Ex6 extends Ex6Base{
    Ex6Interface getBase() {
        return this.new Ex6BaseInner();
    }
    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        System.out.println(ex.getBase().say());
    }
}
