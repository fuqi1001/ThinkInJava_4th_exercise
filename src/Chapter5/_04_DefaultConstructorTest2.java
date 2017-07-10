package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _04_DefaultConstructorTest2 {
    public static void main(String[] args){
        Kabayo2 ka = new Kabayo2();
        Kabayo2 kaa = new Kabayo2("123");
    }
}
class Kabayo2 {
    Kabayo2() {
        System.out.println("this is the kabayo2");
    }
    Kabayo2(String s) {
        System.out.println("Reloading constructor");
    }
}
