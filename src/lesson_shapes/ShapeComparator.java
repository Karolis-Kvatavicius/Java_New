package lesson_shapes;

//        4. Sukurkite klasę ShapeComparator, kuri implementuoja interfeisą Comparator ir lygina figūras pagal užimamą plotą.
//        Sukurkite HashSet'ą su skirtingomis figūromis (apskritimai, stačiakampiai, trikampiai) ir surūšiuokite jas naudojant ShapeComparator logiką.
//        Atspausdinkite elementus prieš ir po rikiavimo abiem atvejais.

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {


    @Override
    public int compare(Shape s1, Shape s2) {
        if(s1.area() > s2.area()) {
            System.out.println(s1.getName() + " is of bigger area than " + s2.getName());
        } else if(s1.area() < s2.area()) {
            System.out.println(s1.getName() + " is of smaller area than " + s2.getName());
        } else if(s1.area() == s2.area()) {
            System.out.println(s1.getName() + " and " + s2.getName() + " are of equal areas.");
        }
        return 0;
    }
}
