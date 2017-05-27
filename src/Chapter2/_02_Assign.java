package Chapter2;

/**
 * Created by Crino on 2017/5/26.
 */
class Tube {
    float level;
}
public class _02_Assign {
    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.level = 0.9f;
        t2.level = 0.47f;
        System.out.println("t1.level: " + t1.level + " t2.level: " + t2.level);
        t1 = t2;
        System.out.println("t1.level: " + t1.level + " t2.level: " + t2.level);
        t1.level = 0.233f;
        System.out.println("t1.level: " + t1.level + " t2.level: " + t2.level);
    }
}
/*
output:
t1.level: 0.9 t2.level: 0.47
t1.level: 0.47 t2.level: 0.47
t1.level: 0.233 t2.level: 0.233
 */