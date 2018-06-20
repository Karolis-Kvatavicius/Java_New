package lesson_shapes;

class TriangleUtils {
    static double getArea(Triangle triangle) {
        double p = getPerimeter(triangle) / 2;
        return Math.sqrt(p * (p - triangle.getX()) * (p - triangle.getY()) * (p - triangle.getZ()));
    }

    static double getArea(double x, double y, double z) {
        double p = getPerimeter(x, y, z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    static double getPerimeter(Triangle triangle) {
        return triangle.getX() + triangle.getY() + triangle.getZ();
    }

    static double getPerimeter(double x, double y, double z) {
        return x + y + z;
    }
}