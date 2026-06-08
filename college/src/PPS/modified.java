package PPS;

import java.util.*;

public class modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder letters =new StringBuilder();
        StringBuilder special =new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                letters.append(Character.toLowerCase(ch));
            }else if(Character.isDigit(ch)){
                letters.append(ch);
            }else{
                special.append(ch);
            }
        }
        System.out.println(letters.toString()+special.toString());
    }
}
