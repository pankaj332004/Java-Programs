package setANDhashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class basic {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(6);
        set1.add(8);
        set1.add(7);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

//        set1.addAll(set2); // Union
//        System.out.println("Union: " + set1); // Output: [1, 2, 3, 4, 5]

//        Set<Integer> intersection = new HashSet<>(set1);
//        intersection.retainAll(set2);
//        System.out.println("Intersection : "+intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference(set1 - set2) : "+difference);

    }
}
