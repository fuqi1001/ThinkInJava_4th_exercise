package Chapter10;

/**
 * Created by qifu on 17/7/19.
 */
public class _19_Ex19 {
    _19_Ex19() {
        System.out.println("Ex19");
    }
    private class Ex19Inner1 {
        Ex19Inner1() {
            System.out.println("Ex19Inner1");
        }
        private class Ex19InnerInner{
            Ex19InnerInner() {
                System.out.println("Ex19InnerInner");
            }
        }
    }

    private static class Ex19Nested {
        Ex19Nested() {
            System.out.println("Ex19Nested");
        }

        private static class Ex19NestedNested {
            Ex19NestedNested() {
                System.out.println("Ex19NestedNested");
            }
        }
    }
    public static void main(String[] args) {
        Ex19Nested en = new Ex19Nested();
        Ex19Nested.Ex19NestedNested enn = new Ex19Nested.Ex19NestedNested();
        _19_Ex19 e19 = new _19_Ex19();
        _19_Ex19.Ex19Inner1 ei = e19.new Ex19Inner1();
        _19_Ex19.Ex19Inner1.Ex19InnerInner eii = ei.new Ex19InnerInner();
    }
}
