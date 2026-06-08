package PPS;

import java.util.Scanner;

public class theLastWord {
    public  static  void word(String s){
        String[] arr = s.split(" ");
        String sb = arr[arr.length-1];
        int count = 0 ;
        for(int i=0;i<sb.length();i++){
            if(Character.isAlphabetic(sb.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void apex(String s){
        int n = s.length();
        int i=n-1;
        while(i>=0 &&( s.charAt(i)=='&' || s.charAt(i)=='*' || s.charAt(i)==' ' || s.charAt(i)=='#')){
            i = i-1;
            int count = 0;
            while(i>=0 && !(s.charAt(i)=='&' || s.charAt(i)=='*' || s.charAt(i)==' ' || s.charAt(i)=='#')){
                count++;
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //word(s);
        apex(s);

    }
}
