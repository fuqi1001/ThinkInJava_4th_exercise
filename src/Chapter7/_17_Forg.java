package Chapter7;

/**
 * Created by qifu on 17/7/12.
 */
public class _17_Forg extends Amphibian{
    @Override
    protected void swin() {
        System.out.println("Forg swim");
    }
    @Override
    protected void speak() {
        System.out.println("Forg speak");
    }
    @Override
    protected void eat(){
        System.out.println("Forg eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Forg grow");
        a.eat();
    }

    public static void main(String[] args) {
        _17_Forg f = new _17_Forg();
        f.speak();
        f.swin();
        f.eat();
        //upcast to Amphibian
        f.grow(f);
        // upcast Frog2 to Amphibian and call Amphibian method:
        Amphibian.grow(f);
    }
}
