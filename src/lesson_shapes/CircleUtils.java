package lesson_shapes;

class CircleUtils {
    private static final double PI = Math.PI;

    static double getArea(Circle circle) {
        return PI * Math.pow(circle.getRadius(), 2);
    }

    static double getArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    static double getPerimeter(Circle circle) {
        return 2 * PI * circle.getRadius();
    }

    static double getPerimeter(double radius) {
        return 2 * PI * radius;
    }
}

