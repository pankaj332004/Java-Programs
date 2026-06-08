package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class leet1207 {
    public static boolean bool(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int key : map.keySet()){
            int val = map.get(key);
            set.add(val);
        }

        return map.size()== set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,1,4,4,5,4,5,4,5,5,5};

        System.out.println(bool(arr));
    }
}
