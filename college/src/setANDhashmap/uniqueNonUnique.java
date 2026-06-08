package setANDhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class uniqueNonUnique {
    static Map<Integer,Integer> mp= new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int b = 0;
        int a = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                b++;
            } else {
                a++;
            }
        }
        System.out.println(a*b);
    }
}
