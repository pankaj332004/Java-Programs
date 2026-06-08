package stringbuilder;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "pankaj";
        char[] ch = s.toCharArray() ;
        Arrays.sort(ch);
        for(char i:ch){
            System.out.print(i);
        }
    }
}
