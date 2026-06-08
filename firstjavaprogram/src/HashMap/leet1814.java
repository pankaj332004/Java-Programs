package HashMap;

import java.util.Arrays;
import java.util.Scanner;

public class leet1814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countNicePairs(arr);
    }
    public static void countNicePairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+rev(nums[j]) == nums[j]+rev(nums[i])) count++;
            }
        }
        System.out.println(count);
    }
    public static int rev(int n){
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n=n/10;
        }
        return r;
    }
}
