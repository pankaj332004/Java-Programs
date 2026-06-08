package PPS;

import java.util.Scanner;

public class Abbreviation {
    public  static  boolean fun(String s1 , String s2){
        if(s2.length()<=3 && s2.length()>=5){
            return false;
        }
        int i=0,j=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j))
                j++;
            if(j==s2.length())
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(fun(s1 , s2));
    }
}
