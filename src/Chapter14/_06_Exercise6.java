package Chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qifu on 17/8/10.
 */
abstract class Shape {
    void draw() {
        System.out.println(this +".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    boolean flag = false;

    public String toString() {
        return (flag ? "H" : "Unh") + " ighlighted " + "Circle";
    }
}

class Square extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + " ighlighted " + "Square";
    }
}

class Triangle extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + " ighlighted " + "Triangle";
    }
}
class Rhomboid extends Shape {
    boolean flag = false;
    public String toString() {
        return (flag ? "H" : "Unh") + " ighlighted " + "Rhomboid";
    }
}
public class _06_Exercise6 {
    public static void rotate(Shape s) {
        if(!(s instanceof Circle)) {
            System.out.println("rotate shape " + s);
        }
    }
    public static void setFlag(Shape s) {
        if(s instanceof Triangle) {
            ((Triangle)s).flag = true;
        }
    }
    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        /*for(Shape shape : shapeList) {
            shape.draw();
        }*/

        for(Shape shape : shapeList) {
            setFlag(shape);
            System.out.println(shape);
        }

    }
}
