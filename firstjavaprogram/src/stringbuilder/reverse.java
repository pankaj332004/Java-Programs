package stringbuilder;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to be reversed : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n=sb.length();
        int r = n-1;
        for(int i=0;i<n/2;i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(r));
            sb.setCharAt(r,temp);
            r--;
        }
        System.out.println(sb);

    }
}
