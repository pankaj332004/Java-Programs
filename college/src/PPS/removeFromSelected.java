package PPS;

import java.util.Scanner;

public class removeFromSelected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n = s1.length(),m=s2.length();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                str.append(s1.charAt(i));
            }
        }
        System.out.println(str);
    }
}

// do