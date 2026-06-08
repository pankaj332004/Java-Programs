package HashSet;

import java.util.HashSet;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert TC - O(1)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(20);
        System.out.println(set);

        // serach  - true/false TC - O(1)
        System.out.println(set.contains(20));
        set.add(60);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(50);
        System.out.println(set+ " " + set.size());

        // set - toArray
        Object[] arr = set.toArray();
        for(int i=0;i<set.size();i++){
            System.out.print(arr[i] + " ");
        }
    }
}
