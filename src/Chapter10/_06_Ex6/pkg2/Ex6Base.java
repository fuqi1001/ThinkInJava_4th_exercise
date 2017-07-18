package Chapter10._06_Ex6.pkg2;

import Chapter10._06_Ex6.pkg1.Ex6Interface;

/**
 * Created by qifu on 17/7/18.
 */
public class Ex6Base {
    protected class Ex6BaseInner implements Ex6Interface {
        public Ex6BaseInner(){};
        @Override
        public String say() {
            return "This is inner()";
        }
    }
}
