package PPS;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++){
            freq.put(arr[i],freq.getOrDefault((arr[i]+0),1));
        }

        int max = Integer.MIN_VALUE;
        for(HashMap.Entry<Integer , Integer> entry : freq.entrySet()){
            max = Math.max(max,entry.getValue());
        }

    }
}
