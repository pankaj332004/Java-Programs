package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctIntegerCountAfterReverseOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
            set.add(reverse(num));
        }
        System.out.println(set.size());
    }
    public static int reverse(int num){
        int rev =0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
}
