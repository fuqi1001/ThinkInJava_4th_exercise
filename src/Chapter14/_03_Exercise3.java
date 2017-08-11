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
public class _03_Exercise3 {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for(Shape shape : shapeList) {
            shape.draw();
        }

        Rhomboid r = new Rhomboid();
        ((Shape)r).draw();
        //inconvertible type
        //((Circle)r).draw();
    }
}
