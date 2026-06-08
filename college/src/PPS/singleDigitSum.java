package PPS;

import java.util.Scanner;

public class singleDigitSum {
    public static int single_Digit_Sum(int n){
        if(n==0) return 0;
        if(n%9==0) return 9;
        return n%9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum=0;
//        int k = sc.nextInt();
//        while(num!=0){
//            sum += num%10;
//            num=num/10;
//        }
//        int tSum = sum*k;
//        while(tSum>=10){
//            sum =0;
//            while(tSum!=0){
//                sum += tSum%10;
//                tSum=tSum/10;
//            }
//            tSum=sum;
//        }
//        System.out.println(tSum);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int t = single_Digit_Sum(n);
        int res = single_Digit_Sum(t*k);
        System.out.println(res);
    }
}
