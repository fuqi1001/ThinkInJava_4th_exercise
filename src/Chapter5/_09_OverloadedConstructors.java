package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _09_OverloadedConstructors {
    public static void main(String[] args) {
        new Doc3(8).intubate();
    }
}
class Doc3 {
    Doc3(int i){
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }
    Doc3(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}
