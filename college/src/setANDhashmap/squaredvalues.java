package setANDhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class squaredvalues {
    static Map<Integer , Integer> mp = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i],arr[i]*arr[i]);
        }
        for( Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
