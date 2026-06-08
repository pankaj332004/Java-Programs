package PPS;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        int count1 = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==1) count1++;
        }
        for(int i=0;i<n;i++){
            if(i==count1){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
