package LOOP;

import java.util.Scanner;

public class divisibleby3OR5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto you want to print : ");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//            }
//        }

        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
}
