package Recursion;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void binary(String s, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)=='0'){
            binary(s+0,n);
            binary(s+1,n);
        }
        else{
            binary(s+0,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        binary("",n);
    }
}
