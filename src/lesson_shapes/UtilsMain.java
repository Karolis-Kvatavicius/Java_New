package lesson_shapes;

class UtilsMain {
    public static void main(String[] args) {
        testUtilsByParams();
        testUtilsByObject();
        testShapeUtils();
    }

    private static void testUtilsByParams() {
        final double r = 3.0;
        System.out.println("Circle area: " + CircleUtils.getArea(r));
        System.out.println("Circle perimeter: " + CircleUtils.getPerimeter(r));

        final double x = 2;
        final double y = 2.5;
        final double z = 4;

        System.out.println("Rectangle area: " + RectangleUtils.getArea(x, y));
        System.out.println("Rectangle perimeter: " + RectangleUtils.getPerimeter(x, y));

        System.out.println("Triangle area: " + TriangleUtils.getArea(x, y, z));
        System.out.println("Triangle perimeter: " + TriangleUtils.getPerimeter(x, y, z) + "\n");
    }

    private static void testUtilsByObject() {

        // TODO: pratestuoti CircleUtils, RectangleUtils, TriangleUtils)
        Circle circle = new Circle(3);
        System.out.println("Circle area: " + CircleUtils.getArea(circle));
        System.out.println("Circle perimeter: " + CircleUtils.getPerimeter(circle));

        Rectangle rectangle = new Rectangle(2, 2.5);
        System.out.println("Rectangle area: " + RectangleUtils.getArea(rectangle));
        System.out.println("Rectangle perimeter: " + RectangleUtils.getPerimeter(rectangle));

        Triangle triangle = new Triangle(2, 2.5, 4);
        System.out.println("Triangle area: " + TriangleUtils.getArea(triangle));
        System.out.println("Triangle perimeter: " + TriangleUtils.getPerimeter(triangle) + "\n");
    }

    private static void testShapeUtils() {
        Shape shape = new Circle(2);
        ShapeUtils.printArea(shape);

        Rectangle rectangle = new Rectangle(1, 2);
        ShapeUtils.printArea(rectangle);

        ShapeUtils.printArea(new Triangle(3, 2, 3));
    }
}