package stringbuilder;

import java.util.Scanner;

public class toogle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii<=90){ // capital
                ascii +=32;
            }
            else if(ascii>=97 && ascii<=122){
                ascii -=32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
