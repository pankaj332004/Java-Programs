package TreesetAndTreemap;

import java.util.TreeMap;
import java.util.TreeSet;

public class basictreeset {
    public static void main(String[] args) {
        // Tree set will always produce  sorted output
        // implemented from bst
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(2);
        set.add(1);
        set.add(15);

        System.out.println(set);

        TreeMap<String , Integer> map = new TreeMap<>();
        map.put("Pankaj",1);
        map.put("Raj",2);
        map.put("Ritesh",3);
        map.put("Aman",4);
        map.put("Agrim",5);
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key);
        }
    }
}
