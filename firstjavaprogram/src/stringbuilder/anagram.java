package stringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1 and 2 : ");
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if (a[i]!=b[i]) {
                System.out.println("strings are not anagram");
                break;
            } else {
                System.out.println("strings are  anagram");
                break;
            }
        }
    }
}
