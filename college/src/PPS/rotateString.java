package PPS;

import java.util.Scanner;

public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            //arr[i]=sc.nextInt();
            s[i]=sc.next();
        }
        sc.nextLine();
//        String[] s=new String[n];
        for(int i=0;i<n;i++){
//            s[i]=sc.nextLine();
            int len = s[i].length();
            arr[i] = arr[i]%len;
            if(arr[i]>0){
                int shift = arr[i]%len;
                System.out.println(s[i].substring(shift)+s[i].substring(0,shift));
            }
            else{
                System.out.println("");
            }
        }
    }
}
