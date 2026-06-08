package Stringjava;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                count++;
//            }
            if(!isVowel(ch)) count++;
        }
        System.out.println("Total consonant in the String is : "+(count));
    }

    public static boolean isVowel(char ch) {
        if(ch=='a' || ch=='A') return  true;
        if(ch=='e' || ch=='E') return true;
        if (ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return  true;
        return false;
    }
}
