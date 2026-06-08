package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class leet3 {
    public static void main(String[] args){
        String s = "abefcabcgb";

        HashMap<Character,Integer> map = new HashMap<>();
        int j=0,i=0;
        int maxLen =0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len = j-i;
                maxLen = Math.max(len , maxLen);

                while(s.charAt(i)!=ch) i++;
                i++;
            }
            map.put(ch,j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);

        System.out.println(maxLen);
    }
}
