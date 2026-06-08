package PPS;

import java.util.Scanner;

public class secondString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String sb = "";
        int n = sc.nextInt();
        for(int i =0;i<s1.length();i++){
            sb = sb+s1.substring(i);
            if(i%n==0){
                sb=sb+s2;
            }
        }
        System.out.println(s1);
    }
}
