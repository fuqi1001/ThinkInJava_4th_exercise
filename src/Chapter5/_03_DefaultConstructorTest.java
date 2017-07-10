package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _03_DefaultConstructorTest {
    public static void main(String[] args) {
        Kabayo kabayo = new Kabayo();
    }
}
class Kabayo {
    Kabayo() {
        System.out.println("This is a kabayo");
    }
}

