package lesson9.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListExamples {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        initialize(arrList);
        System.out.println(arrList);

        List<Integer> linkedList = new LinkedList<>();
        initialize(linkedList);
        linkedList.add(arrList.get(2));
        linkedList.addAll(arrList);
        System.out.println(linkedList);
    }

    private static void initialize(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
    }
}
