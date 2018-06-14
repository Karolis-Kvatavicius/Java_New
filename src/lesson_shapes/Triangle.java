//package lesson_shapes;
//
//    class Triangle implements Shape {
//        private double a;
//        private double b;
//        private double c;
//
//        Triangle(double a, double b, double c) {
//            if (a <= 0 || b <= 0 || c <= 0) {
//                System.out.println("Invalid values!");
//                System.out.println("Assigning default values of [1, 1, 1]");
//                this.a = 1;
//                this.b = 1;
//                this.c = 1;
//
//            } else if(a + b <= c || a + c <= b || c + b <= a) {
//                System.out.println("Not a triangle!");
//                System.out.println("Assigning default values of [1, 1, 1]");
//                this.a = 1;
//                this.b = 1;
//                this.c = 1;
//            }
//
//            else {
//                this.a = a;
//                this.b = b;
//                this.c = c;
//            }
//        }
//
//        Triangle() {
//            this.a = a;
//            this.b = b;
//            this.c = c;
//        }
//
//        @Override
//        double area() {
//            //Herono formule
//            double halfPerimeter =  perimeter() / 2;
//            return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
//        }
//
//        @Override
//        double perimeter() {
//            return a + b + c;
//        }
//
//        boolean isTriangle() {
//            return (a + b > c && a + c > b && c + b > a);
//        }
//    }
