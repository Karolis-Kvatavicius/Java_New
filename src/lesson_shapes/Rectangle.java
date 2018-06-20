package lesson_shapes;

class Rectangle implements Shape {
    private double x;
    private double y;

    Rectangle(double x, double y) {
        if (x <= 0 || y <= 0) {
            System.out.println("\nInvalid values!");
            System.out.println("Assigning default values... [1, 1]");
            this.x = 1;
            this.y = 1;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    Rectangle() {
        this.x = 1;
        this.y = 1;
    }

    public double area() {
        return x * y;
    }

    public double perimeter() {
        return 2 * (x + y);
    }

    boolean isSquare() {
        return x == y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
