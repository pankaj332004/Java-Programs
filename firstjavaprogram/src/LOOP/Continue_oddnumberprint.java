package LOOP;

import java.util.Scanner;

public class Continue_oddnumberprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
       // for(int i=1;i<=n;i+=2){
       //     System.out.println(i+" ");
//            if(i%2!=0){
//                System.out.println(i+" ");
//            }
//            else{
//                System.out.println(i+" ");
//            }
        //}
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
