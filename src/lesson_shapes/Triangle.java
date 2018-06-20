package lesson_shapes;

class Triangle implements Shape {
    private double x;
    private double y;
    private double z;

    Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        double p = perimeter()/ 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}