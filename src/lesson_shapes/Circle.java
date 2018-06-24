package lesson_shapes;

import java.util.Comparator;


class Circle implements Shape, Comparable<Circle> {
    private String name;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getRadius() {
        return r;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        return 0;

    }

}
