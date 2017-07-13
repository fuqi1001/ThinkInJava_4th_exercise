package Chapter8;

import java.util.Random;

/**
 * Created by qifu on 17/7/13.
 */
class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next() {
        switch (random.nextInt(3)) {
            default:
            case 0: return new Squre();
            case 1: return new Triangle();
            case 2: return new Circle();
        }
    }
}
class Shape {
    public void draw() {};
    public void erase() {};
    public void amend() {System.out.println("Shape.amend()");}
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
    @Override
    public void amend() {
        System.out.println("Squre.amend()");
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
    @Override
    public void amend() {
        System.out.println("Triangle.amend()");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }
    @Override
    public void amend() {
        System.out.println("Circle.amend()");
    }

}
public class _03_Shapes {
    private static RandomShapeGenerator rg = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];

        for(int i = 0; i < s.length; i++) {
            s[i] = rg.next();
        }
        for(Shape shp : s) {
            shp.draw();
            shp.amend();
        }
    }
}
