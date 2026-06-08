package HashSet;

import java.util.HashSet;

public class maximumNumberOfStringAfterReverse {
    public static void main(String[] args) {
        String words[] = {"cd","ac","dc","ca","dc","tu"};
        HashSet<String> set = new HashSet<>();

        int count=0;
        for(int i=0;i< words.length;i++){
            String rev = new StringBuilder(words[i]).reverse().toString();
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }
            else set.add(words[i]);
        }
        System.out.println(count);
    }
}
