package Chapter7;

/**
 * Created by qifu on 17/7/12.
 */
class Amphibian {
    protected void swin() {
        System.out.println("Amphibian swim");
    }
    protected void speak() {
        System.out.println("Amphibian speak");
    }
    void eat() {
        System.out.println("Amphibian eat");
    }
    static void grow(Amphibian a){
        System.out.println("Amphibian eat");
        a.eat();
    }

}

public class _16_Forg extends Amphibian{
    public static void main(String[] args){
        _16_Forg f = new _16_Forg();
        f.swin();
        f.speak();
        f.eat();
        //upcast Forg to Amphibian
        Amphibian.grow(f);
    }
}
