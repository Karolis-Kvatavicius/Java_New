//        3. Klasę Rectangle papildyti interfeisu Comparable ir implementuoti lyginimą pagal užimamą vietą horizantalioje padėtyje.
//        Patikrinti veikimą su keliais skirtingais stačiakampiais (lyginti poras).

package lesson_shapes;

class Rectangle implements Shape, Comparable<Rectangle> {
    private String name;
    private double x;
    private double y;

    Rectangle(String name, double x, double y) {
        if (x <= 0 || y <= 0) {
            System.out.println("\nInvalid values!");
            System.out.println("Assigning default values... [1, 1]");
            this.name = name;
            this.x = 1;
            this.y = 1;
        } else {
            this.name = name;
            this.x = x;
            this.y = y;
        }
    }

    Rectangle() {
        this.name = "default rectangle";
        this.x = 1;
        this.y = 1;
    }

    public double area() {
        return x * y;
    }

    public double perimeter() {
        return 2 * (x + y);
    }

    boolean isSquare() {
        return x == y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Rectangle r2) {
        if(this.getX() > r2.getX()) {
            System.out.println(this.getName() + " takes more space in horizontal axis than " + r2.getName());
        } else if(this.getX() < r2.getX()) {
            System.out.println(this.getName() + " takes less space in horizontal axis than " + r2.getName());
        } else if(this.getX() == r2.getX()) {
            System.out.println(this.getName() + " and " + r2.getName() + " takes equal amount of space in horizontal axis");
        }
        return 0;
    }
}
