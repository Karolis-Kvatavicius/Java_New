//package lesson_shapes;
//
//class Rectangle extends Shape {
//    private double x;
//    private double y;
//
//    // FAIL turejo but square pavadinimas
//    Rectangle(double x, double y) {
//        if (x <= 0 || y <= 0) {
//            System.out.println("Invalid values!");
//            System.out.println("Assigning default values... [1, 1]");
//            this.x = 1;
//            this.y = 1;
//        } else if(x != y) {
//            System.out.println("Not a rectangle!");
//            this.x = x;
//            this.y = y;
//        } else {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    Rectangle() {
//        this.x = 1;
//        this.y = 1;
//    }
//
//    @Override
//    double area() {
//        return x * y;
//    }
//
//    @Override
//    double perimeter() {
//        return 2 * (x + y);
//    }
//
//    boolean isSquare() {
//        return x == y;
//    }
//}
