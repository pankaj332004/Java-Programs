package PPS;

import java.util.Scanner;

public class movesSections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String result = "";
        String ans = "";
        for(int i=0;i<n;i++){
            if((i+1)%4==0 || (i+1)%6==0) {
                result += s.charAt(i);
            }else{
                ans += s.charAt(i);
            }
        }
        System.out.println(ans + result);
    }
}
