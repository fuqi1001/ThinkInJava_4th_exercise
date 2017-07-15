package Chapter9._11_Exercies;

/**
 * Created by qifu on 17/7/14.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
