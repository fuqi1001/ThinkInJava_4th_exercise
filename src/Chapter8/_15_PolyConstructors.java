package Chapter8;

/**
 * Created by qifu on 17/7/13.
 */
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int len = 2;
    private int wid = 4;
    RectangularGlyph(int l, int w) {
        len = l;
        wid = w;
        System.out.println("RectangularGlyph.RectangularGlyph(), length = " + len +", width = " + wid);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), length = " + len +", width = " + wid);
    }
}
public class _15_PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(4 ,6);
    }
}
