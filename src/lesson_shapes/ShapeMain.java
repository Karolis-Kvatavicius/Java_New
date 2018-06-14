package lesson_shapes;

import java.awt.*;

public class  ShapeMain {
    public static void main(String[] args) {
        checkRectangles(10);
//        checkCircles(10);
//        checkTriangles(3);

    }

    private static void checkRectangles(int count) {

        for (int i = 0; i < count; i++) {
            Shape shape1 = new Rectangle(Math.random () * 10 - 3, Math.random () * 10 - 3);
            System.out.println("shape" + i + " is square: " + ((Rectangle) shape1).isSquare());
            System.out.println("Area = " + ((Rectangle) shape1).area());
            System.out.println("Perimeter = " + ((Rectangle) shape1).perimeter() + "\n");
        }
    }

    private static void checkCircles(int count) {

        for (int i = 0; i < count; i++) {
            Shape shape2 = new Circle(Math.random () * 10 - 5);
            System.out.println("shape" + i + " is circle: " + ((Circle) shape2).isCircle());
            System.out.println("Area = " + ((Circle) shape2).area());
            System.out.println("Perimeter = " + ((Circle) shape2).perimeter() + "\n");
        }
    }

    private static void checkTriangles(int count) {

        for (int i = 0; i < count; i++) {
            Shape shape3 = new Triangle(Math.random () * 10 - 2, Math.random () * 10 - 2, Math.random () * 10 - 2);
            System.out.println("shape" + i + " is triangle: " + ((Triangle) shape3).isTriangle());
            System.out.println("Area = " + ((Triangle) shape3).area());
            System.out.println("Perimeter = " + ((Triangle) shape3).perimeter() + "\n");
        }
    }
}
