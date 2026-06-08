package HashMap;

import java.util.HashMap;
import java.util.Map;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Pankaj",170);
        map.put("Raj",186);
        map.put("Ritesh",197);
        map.put("Rohan",204);
        map.put("Ritik",196);
        map.put("Niketan",161);
        map.put("Nipun",164);

//        for(Map.Entry<String,Integer> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"  "+entry.getValue());
//        }


//        for(String key : map.keySet()){
//            int val = map.get(key);
//            System.out.println(key+" "+val);
//        }
        for(int val: map.values()){
            System.out.println(val);
        }
    }
}
