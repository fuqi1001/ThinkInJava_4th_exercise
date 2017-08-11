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
    public String toString() {
        return "Circle";
    };
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}
class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}
public class _05_Exercise5 {
    public static void rotate(Shape s) {
        if(!(s instanceof Circle)) {
            System.out.println("rotate shape " + s);
        }
    }
    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape : shapeList) {
            shape.draw();
        }

        Rhomboid r = new Rhomboid();
        Shape s = (Shape)r;
        s.draw();
        //check type
        if(s instanceof Circle) {
            ((Circle)s).draw();
        } else if(!(s instanceof Circle)){
            System.out.println("(Shape)s is not a Circle");
        }


        System.out.println("ROTATE: ");
        for(Shape cur: shapeList) {
            rotate(cur);
        }
        //inconvertible type
        //((Circle)r).draw();
    }
}