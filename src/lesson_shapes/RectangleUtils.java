package lesson_shapes;

class RectangleUtils {
    static double getArea(Rectangle rectangle) {
        return rectangle.getX() * rectangle.getY();
    }

    static double getArea(double x, double y) {
        return x * y;
    }

    static double getPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getX() + 2 * rectangle.getY();
    }

    static double getPerimeter(double x, double y) {
        return 2 * (x + y);
    }
}
