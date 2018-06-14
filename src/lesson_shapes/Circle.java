package lesson_shapes;

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Invalid values for a circle!");
            System.out.println("Assigning default radius of 1");
            this.radius = 1;
        } else {
            this.radius = radius;
       }
    }

    Circle() {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    boolean isCircle() {
        return radius > 0;
    }
}
