package practical2;

import java.lang.reflect.Array;
import java.util.*;

public class mapBasics {
    static Map<String, Integer> map = new HashMap<>();
    public static  void sortByValues(){
        ArrayList<Integer> sortvalues = new ArrayList<Integer>(map.values());
        Collections.sort(sortvalues);

        for(int x: sortvalues)
            System.out.println("value : " + x +" and key : "+map.get(x));
    }
    public static void main(String[] args) {

        map.put("A", 20);
        map.put("B", 10);
        map.put("C", 40);
        map.put("D", 30);
        map.put("E", 60);
        map.put("F", 70);
        map.put("G", 50);


//        for (Map.Entry<String, Integer> mp : map.entrySet()) {
//            System.out.println(mp.getKey() + " : " + mp.getValue());
//        }
        sortByValues();


    }
}
