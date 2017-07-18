package Chapter10;

/**
 * Created by qifu on 17/7/18.
 */
interface Ex13Interface {
    String say(String s);
}
public class _13_Outer {
    Ex13Interface f() {
        return new Ex13Interface() {
            @Override
            public String say(String s) {
                return s;
            }
        };
    }

    public static void main(String[] args) {
        _13_Outer ot = new _13_Outer();
        System.out.println(ot.f().say("hi"));
    }
}