package PPS;

import java.util.Scanner;

public class reverseLettersOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[]  arr= s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            if(!Character.isLetter(s.charAt(i))){
                i++;
            }else if(!Character.isLetter(s.charAt(j))){
                j--;
            }else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        System.out.println(new String(arr));
    }
}
