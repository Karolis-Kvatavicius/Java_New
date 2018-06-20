package lesson_shapes;

interface Shape {

    double area();
    double perimeter();

    default void printArea() {
        System.out.println(area());
    }

    default void printPerimeter() {
        System.out.println(perimeter());
    }

    static void areaLabel(String name) {

        if(name == "Trikampis") {
            System.out.println("Trikampio plotas yra: ");
        } else if(name == "Keturkampis") {
            System.out.println( "Keturkampio plotas yra: " );
        } else if(name == "Apskritimas") {
            System.out.println( "Apskritimo plotas yra: " );
        } else {
            System.out.println("Unknown shape");
        }
    }

    static void perimeterLabel(String name) {

        if(name == "Trikampis") {
            System.out.println("Trikampio perimetras yra: ");
        } else if(name == "Keturkampis") {
            System.out.println( "Keturkampio perimetras yra: " );
        } else if(name == "Apskritimas") {
            System.out.println( "Apskritimo perimetras yra: " );
        } else {
            System.out.println("Unknown shape");
        }
    }
}