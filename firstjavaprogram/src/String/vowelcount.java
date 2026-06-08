package String;

import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.println(s);
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
//            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='u'){
//                count++;
//            }
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }

    public static boolean isVowel(char ch) {
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}
