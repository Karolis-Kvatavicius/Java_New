package lesson_shapes;

//       2. Klasę Triangle papildyti interfeisu Comparable ir implementuoti trikampių lyginimą taip, kad laikitume trikampį didesniu, jei jo plotas yra didesnis.
//        Patikrinti veikimą su keliais skirtingais trikampiais (lyginti poras).

class Triangle implements Shape, Comparable<Triangle>  {
    private String name;
    private double x;
    private double y;
    private double z;

    Triangle(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public double area() {
        double p = perimeter()/ 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Triangle t2) {
        if(this.area() > t2.area()) {
            System.out.println(this.getName() + " is of bigger area than " + t2.getName());
        } else if(this.area() < t2.area()) {
            System.out.println(this.getName() + " is of smaller area than " + t2.getName());
        } else if(this.area() == t2.area()) {
            System.out.println(this.getName() + " and " + t2.getName() + " are of equal areas.");
        }
        return 0;
    }
}