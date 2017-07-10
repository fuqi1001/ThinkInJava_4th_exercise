package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _08_PassingThisEx {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}
class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("Use laryngoscope");
    }
}
