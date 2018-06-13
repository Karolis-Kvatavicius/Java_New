package lesson_shapes;

public class  ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(4, 5);
        if (shape1 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape1;
            System.out.println("shape 1 is square: " + rectangle.isSquare());
            // TODO: atspausdinti plota ir perimetra
        }

        Shape shape2 = new Rectangle(4, 4);
        System.out.println("shape 2 is square: " + ((Rectangle) shape2).isSquare());
        // TODO: atspausdinti plota ir perimetra

        Shape shape3 = new Rectangle(0, 0);
        System.out.println("shape 3 is square: " + ((Rectangle) shape3).isSquare());
        // TODO: atspausdinti plota ir perimetra

        Shape shape4 = new Rectangle(4, 0);
        System.out.println("shape 4 is square: " + ((Rectangle) shape4).isSquare());
        // TODO: atspausdinti plota ir perimetra

        Shape shape5 = new Rectangle(-4, -4);
        System.out.println("shape 5 is square: " + ((Rectangle) shape5).isSquare());
        // TODO: atspausdinti plota ir perimetra
    }
}
