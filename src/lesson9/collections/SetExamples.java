package lesson9.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetExamples {
    public static void main(String[] args) {
        // Double
        Set<Double> doubleHashSet = new HashSet<>();
        initializeDouble(doubleHashSet);
        System.out.println(doubleHashSet);

        Set<Double> doubleTreeSet = new TreeSet<>();
        initializeDouble(doubleTreeSet);
        doubleTreeSet.addAll(doubleHashSet);
        System.out.println(doubleTreeSet);
        System.out.println();

        // String
        Set<String> hashSet = new HashSet<>();
        initializeString(hashSet);
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        initializeString(treeSet);
        System.out.println(treeSet);
    }

    private static void initializeDouble(Set<Double> set) {
        set.add(25.23);
        set.add(25.23);
        set.add(1.0);
        set.add(12.5);
        set.add(25.29);
        set.add(2.1);
        set.add(25.21);
    }

    private static void initializeString(Set<String> set) {
        set.add("z");
        set.add("za");
        set.add("zbggd");
        set.add("a");
        set.add("d");
        set.add("abc");
        set.add("b");
        set.add("c");
        set.add("a");
    }
}
