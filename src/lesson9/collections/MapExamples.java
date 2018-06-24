package lesson9.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        initialize(hashMap);
        System.out.println(hashMap);
        System.out.println();

        Map<String, Integer> treeMap = new TreeMap<>();
        initialize(treeMap);
        System.out.println(treeMap);
    }

    private static void initialize(Map<String, Integer> map) {
        map.put("z", 1);
        map.put("za", 5);
        map.put("zbggd", 1);
        map.put("a", 5);
        map.put("d", 10);
        map.put("abc", 25);
        map.put("b", 0);
        map.put("c", 12);
        map.put("a", 15);
    }
}
