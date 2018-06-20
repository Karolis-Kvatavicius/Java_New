package lesson_shapes;

class ShapePolymoTest {

    void printArea(Shape shape) {
        System.out.println("Shape Area: " + shape.area());
    }

    void printArea(Rectangle rectangle) {
        System.out.println("Rectangle Area: " + rectangle.area());
    }

    void printArea(Circle circle) {
        System.out.println("Circle Area: " + circle.area());
    }
}
