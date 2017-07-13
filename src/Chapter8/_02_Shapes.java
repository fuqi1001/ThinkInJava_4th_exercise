package Chapter8;

import sun.security.provider.SHA;

import java.util.Random;

/**
 * Created by qifu on 17/7/13.
 */

class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next() {
        switch (random.nextInt(2)) {
            default:
            case 0: return new Squre();
            case 1: return new Triangle();
        }
    }
}
class Shape {
    public void draw() {};
    public void erase() {};
}
class Squre extends Shape {
    @Override
    public void draw() {
        System.out.println("Squre.draw");
    }
    @Override
    public void erase() {
        System.out.println("Squre.erase");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase");
    }
}
public class _02_Shapes {
    private static RandomShapeGenerator rg = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];

        for(int i = 0; i < s.length; i++) {
            s[i] = rg.next();
        }
        for(Shape shp : s) {
            shp.draw();
        }
    }
}


