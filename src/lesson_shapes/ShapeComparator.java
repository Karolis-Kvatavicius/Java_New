package lesson_shapes;

//        4. Sukurkite klasę ShapeComparator, kuri implementuoja interfeisą Comparator ir lygina figūras pagal užimamą plotą.
//        Sukurkite HashSet'ą su skirtingomis figūromis (apskritimai, stačiakampiai, trikampiai) ir surūšiuokite jas naudojant ShapeComparator logiką.
//        Atspausdinkite elementus prieš ir po rikiavimo abiem atvejais.

import java.util.Comparator;


public class ShapeComparator implements Comparator<Shape> {


//    didejimo tvarka rikiavimas neveikia tvarkingai
    @Override
    public int compare(Shape o1, Shape o2) {

           if (o1.area() > o2.area()) {

               return (int) (o2.area() - o1.area());
           }

        return 0;
    }
}
