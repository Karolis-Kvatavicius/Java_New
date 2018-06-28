//ND 06.21
//
//        1. Duotas masyvas {-10, 0, 2, 9, -5}. Surikiuokite jo elementus didėjimo tvarka (galima naudoti sort funkciją).
//        Po to paverskite masyvą į Listą ir surikiuokite listo elementus mažėjimo tvarka.
//        Atspausdinkite elementus prieš ir po rikiavimo abiem atvejais.


package homework_06_21;

import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayListExercise {

    public static void main(String[] args) {
//
//        Integer[] array = {-10, 0, 2, 9, -5};
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println();
//
//        List<Integer[]> arrayList = new ArrayList<>();
//        arrayList.add(array);
//        System.out.println(Arrays.deepToString(arrayList.toArray()));
//
//        Arrays.sort(arrayList.get(0), Collections.reverseOrder());
//        System.out.println(Arrays.deepToString(arrayList.toArray()));

        int[] array = {-10, 0, 2, 9, -5};
        System.out.println(IntStream.of(array).sum());
        System.out.println(Arrays.stream(array).count());

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(10);
        intList.add(15);
        intList.add(-17);
        System.out.println(intList.stream().count());

    }
 }

