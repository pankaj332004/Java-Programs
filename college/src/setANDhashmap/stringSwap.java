package setANDhashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class stringSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sb = sc.next();
        s.toLowerCase();
        sb.toLowerCase();

        char[] a = s.toCharArray();
        char[] b = sb.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int count =0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                count++;
            }
        }
        if(count<=2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
