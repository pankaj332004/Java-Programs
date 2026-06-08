package PPS;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class passwordMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        int t = sc.nextInt();
        int[] arr = new int[t];
        String rotated ="";
        int sum =0 ;
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
            //int d = Math.abs(arr[i])%s.length();
//            if(arr[i]<0){
//                rotated = s.substring(d) + s.substring(0,d);
//            }
//            else{
//                rotated = s.substring(s.length()-d) + s.substring(0,s.length()-d);
//            }
        }
        int d = Math.abs(sum)%s.length();
        if(sum<0){
            rotated = s.substring(d) + s.substring(0,d);
        }
        else{
            rotated = s.substring(s.length()-d) + s.substring(0,s.length()-d);
        }
        if(rotated.equals(r)){
            System.out.println("Password  Accepted");
        }else {
            System.out.println("Try again");
        }
    }
}
