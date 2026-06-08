package HashSet;

import java.util.HashSet;

public class addSameInSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Pankaj");
        set.add("Abhii");
        set.add("Agrim");
        set.add("Ritesh");
        set.add("Pankaj");
        set.add("Pankaj");
        set.add("Pankaj");

        set.remove("Pankaj");
        System.out.println(set);
    }
}
