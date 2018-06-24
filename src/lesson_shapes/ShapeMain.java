package lesson_shapes;

import java.util.*;

public class ShapeMain {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle("rec shape", 4, 5);


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle("rec2", 4, 6);
        Rectangle rectangle3 = new Rectangle("rec3", 7, 10);
        Rectangle rectangle4 = new Rectangle();

        Shape triangle = new Triangle("shape",5, 10, 7);

        Triangle triangle1 = new Triangle("first triangle",8, 11, 6);
        Triangle triangle2 = new Triangle("second triangle",8, 11, 4);
        Triangle triangle3 = new Triangle("third triangle",5, 11, 6);
        Triangle triangle4 = new Triangle("fourth triangle",8, 9, 6);

        ShapePolymoTest test = new ShapePolymoTest();

        Shape circle = new Circle(5, "circle");
        Circle circle2 = new Circle(2, "circle2");
        Circle circle3 = new Circle(10, "circle3");

        List<Shape> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(circle2);
        circles.add(circle3);

//        System.out.println();
//        triangle1.compareTo(triangle2);
//        triangle1.compareTo(triangle3);
//        triangle1.compareTo(triangle4);
//        System.out.println();
//        triangle2.compareTo(triangle3);
//        triangle2.compareTo(triangle4);
//        System.out.println();
//        triangle3.compareTo(triangle3);
//        System.out.println();
//
//        rectangle1.compareTo(rectangle2);
//        rectangle1.compareTo(rectangle3);
//        rectangle1.compareTo(rectangle4);
//        System.out.println();
//        rectangle2.compareTo(rectangle3);
//        rectangle2.compareTo(rectangle4);
//        System.out.println();
//        rectangle3.compareTo(rectangle4);
//        System.out.println();

        Set<Shape> shapeList = new HashSet<>();
        shapeList.add(triangle1);
        shapeList.add(triangle2);
        shapeList.add(rectangle2);
        shapeList.add(rectangle3);
        shapeList.add(circle);
        shapeList.add(circle2);
        shapeList.add(circle3);

        List<Shape> shapeList2 = new ArrayList<>(shapeList);
        for(int i = 0; i < shapeList2.size(); i++) {
            System.out.println( shapeList2.get( i ).area() + " " + shapeList2.get( i ).getName());
        }

        ShapeComparator shapesComparator = new ShapeComparator();
        Collections.sort(shapeList2, shapesComparator);
        System.out.println();


        for(int i = 0; i < shapeList2.size(); i++) {
            System.out.println( shapeList2.get( i ).area() + " " + shapeList2.get( i ).getName());
        }

        //Collections.sort(shapeList, shapesComparator);



        //shapesComparator.compare( shapeList, shapeList );


        //System.out.println(Arrays.deepToString(shapeList.toArray()));



//        test.printArea(rectangle);
//        test.printArea(rectangle2);
//
//        test.printArea(circle);
//        test.printArea(circle2);

//        Shape.areaLabel("Apskritimas");
//        circle.printArea();
//
//        Shape.perimeterLabel("Apskritimas");
//        circle.printPerimeter();
//
//        Shape.areaLabel("Apskritimas");
//        circle2.printArea();
//
//        Shape.perimeterLabel("Apskritimas");
//        circle2.printPerimeter();
//
//        Shape.areaLabel("Keturkampis");
//        rectangle.printArea();
//
//        Shape.perimeterLabel("Keturkampis");
//        rectangle.printPerimeter();
//
//        Shape.areaLabel("Keturkampis");
//        rectangle2.printArea();
//
//        Shape.perimeterLabel("Keturkampis");
//        rectangle2.printPerimeter();
//
//        Shape.areaLabel("Trikampis");
//        triangle.printArea();
//
//        Shape.perimeterLabel("Trikampis");
//        triangle.printPerimeter();
//
//        Shape.areaLabel("Trikampis");
//        triangle2.printArea();
//
//        Shape.perimeterLabel("Trikampis");
//        triangle2.printPerimeter();
    }
}
