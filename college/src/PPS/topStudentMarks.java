package PPS;

import java.util.Arrays;
import java.util.Scanner;

public class topStudentMarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        for(int i=n-1;i>=n-5;i--){
            sum += arr[i];
        }
        System.out.println(sum);
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
