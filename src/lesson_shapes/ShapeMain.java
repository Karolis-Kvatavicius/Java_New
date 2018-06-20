package lesson_shapes;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(4, 6);

        Shape circle = new Circle(5);
        Circle circle2 = new Circle(2);

        Shape triangle = new Triangle(5, 10, 7);
        Triangle triangle2 = new Triangle(8, 11, 4);

        ShapePolymoTest test = new ShapePolymoTest();

//        test.printArea(rectangle);
//        test.printArea(rectangle2);
//
//        test.printArea(circle);
//        test.printArea(circle2);

        Shape.areaLabel("Apskritimas");
        circle.printArea();

        Shape.perimeterLabel("Apskritimas");
        circle.printPerimeter();

        Shape.areaLabel("Apskritimas");
        circle2.printArea();

        Shape.perimeterLabel("Apskritimas");
        circle2.printPerimeter();

        Shape.areaLabel("Keturkampis");
        rectangle.printArea();

        Shape.perimeterLabel("Keturkampis");
        rectangle.printPerimeter();

        Shape.areaLabel("Keturkampis");
        rectangle2.printArea();

        Shape.perimeterLabel("Keturkampis");
        rectangle2.printPerimeter();

        Shape.areaLabel("Trikampis");
        triangle.printArea();

        Shape.perimeterLabel("Trikampis");
        triangle.printPerimeter();

        Shape.areaLabel("Trikampis");
        triangle2.printArea();

        Shape.perimeterLabel("Trikampis");
        triangle2.printPerimeter();
    }
}
