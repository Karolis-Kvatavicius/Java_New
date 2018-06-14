package lesson_shapes;

public class  ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(4, 5);
        if (shape1 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape1;
            System.out.println("shape 1 is square: " + rectangle.isSquare());
            System.out.println("Area = " + rectangle.area());
            System.out.println("Perimeter = " + rectangle.perimeter() + "\n");
        }

        Shape shape2 = new Rectangle(4, 4);
        System.out.println("shape 2 is square: " + ((Rectangle) shape2).isSquare());
        System.out.println("Area = " + ((Rectangle) shape2).area());
        System.out.println("Perimeter = " + ((Rectangle) shape2).perimeter() + "\n");

        Shape shape3 = new Rectangle(0, 0);
        System.out.println("shape 3 is square: " + ((Rectangle) shape3).isSquare());
        System.out.println("Area = " + ((Rectangle) shape3).area());
        System.out.println("Perimeter = " + ((Rectangle) shape3).perimeter() + "\n");

        Shape shape4 = new Rectangle(4, 0);
        System.out.println("shape 4 is square: " + ((Rectangle) shape4).isSquare());
        System.out.println("Area = " + ((Rectangle) shape4).area());
        System.out.println("Perimeter = " + ((Rectangle) shape4).perimeter() + "\n");

        Shape shape5 = new Rectangle(-4, -4);
        System.out.println("shape 5 is square: " + ((Rectangle) shape5).isSquare());
        System.out.println("Area = " + ((Rectangle) shape5).area());
        System.out.println("Perimeter = " + ((Rectangle) shape5).perimeter() + "\n");

        Shape shape6 = new Circle(5);
        System.out.println("shape 6 is circle: " + ((Circle) shape6).isCircle());
        System.out.println("Area = " + ((Circle) shape6).area());
        System.out.println("Perimeter = " + ((Circle) shape6).perimeter() + "\n");

        Shape shape7 = new Circle(0);
        System.out.println("shape 7 is circle: " + ((Circle) shape7).isCircle());
        System.out.println("Area = " + ((Circle) shape7).area());
        System.out.println("Perimeter = " + ((Circle) shape7).perimeter() + "\n");

        Shape shape8 = new Triangle(0, 5, 7);
        System.out.println("shape 8 is triangle: " + ((Triangle) shape8).isTriangle());
        System.out.println("Area = " + ((Triangle) shape8).area());
        System.out.println("Perimeter = " + ((Triangle) shape8).perimeter() + "\n");

        Shape shape9 = new Triangle(7, 10, 5);
        System.out.println("shape 9 is triangle: " + ((Triangle) shape9).isTriangle());
        System.out.println("Area = " + ((Triangle) shape9).area());
        System.out.println("Perimeter = " + ((Triangle) shape9).perimeter() + "\n");
    }
}
